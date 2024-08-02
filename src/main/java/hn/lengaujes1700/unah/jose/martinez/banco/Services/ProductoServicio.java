package hn.lengaujes1700.unah.jose.martinez.banco.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lengaujes1700.unah.jose.martinez.banco.Models.Producto;
import hn.lengaujes1700.unah.jose.martinez.banco.Repositories.ClienteRepository;
import hn.lengaujes1700.unah.jose.martinez.banco.Repositories.ProductoRepository;

/*Solo realiza llamados a la logica */
@Service
public class ProductoServicio {

        @Autowired
        private ProductoRepository productoRepository;

        @Autowired
        private ClienteRepository clienteRepository;

        public Producto crearProducto(String dni, Producto nvProducto)
        {
            if(this.clienteRepository.existsById(dni))
            {
                nvProducto.setCliente(this.clienteRepository.findById(dni).get());
            }

            return null;
        }

        public String eliminarProducto(String dni, Integer codigoProducto)
        {
            if(this.clienteRepository.existsById(dni))
            {
                List<Producto> productosCliente = this.clienteRepository.findById(dni).get().getProducto();
         
                for (Producto producto: productosCliente)
                {
                    if(producto.getCodigoProducto() == codigoProducto)
                    {
                        this.productoRepository.delete(producto);
                        return "Este producto ha sido eliminado";
                    }
                }
            }
            if(productoRepository .existsById(codigoProducto))
            {
                this.productoRepository.deleteById(codigoProducto);
            }

            return "No se ha encontrado un producto asociado ";
        }
}
