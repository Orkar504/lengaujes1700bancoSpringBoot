package hn.lengaujes1700.unah.jose.martinez.banco.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lengaujes1700.unah.jose.martinez.banco.Models.Cliente;
import hn.lengaujes1700.unah.jose.martinez.banco.Models.Direccion;
import hn.lengaujes1700.unah.jose.martinez.banco.Repositories.ClienteRepository;
import hn.lengaujes1700.unah.jose.martinez.banco.Repositories.DireccionRepository;

@Service
/*Solo realiza llamados a la logica */
public class ClienteServicio {

    @Autowired /*Inyeccion que hace que spring agregue las dependencias necesarias */
    private ClienteRepository clienteRepository;

    @Autowired
    private DireccionRepository direccionRepository;

    public List<Cliente> getAllClientes()
    {
        return this.clienteRepository.findAll();
       
    }

    public boolean clienteExist(String ID)
    {
        return this.clienteRepository.existsById(ID);
    }

    public Cliente createCliente(Cliente nvocliente)
    {
        if(!this.clienteRepository.existsById(nvocliente.getDni()))
        {
            Direccion nvaDireccion = nvocliente.getDireccion();
            if(nvaDireccion != null)
            {
                nvaDireccion.setCliente(nvocliente);
            }
          return this.clienteRepository.save(nvocliente);
        }
        return null;

    }

    public String deleteCliente(String dni)
    {
        if (this.clienteRepository.existsById(dni))
        {
            this.clienteRepository.deleteById(dni);
            return "cliente eliminado";

        } else{
            return "no se ha borrado el cliente";
        }
        

    }
}

  /*   
  * Esto no es necesario hacerlo, ya que estamos utilizando actualizaciones en Cascada
  Cliente clienteSave = this.clienteRepository.save(nvocliente);
            Direccion nvaDireccion = nvocliente.getDireccion();
            nvocliente.getDireccion().setCliente(nvocliente);

            this.direccionRepository.save(nvaDireccion);
            this.clienteRepository.save(clienteSave);
            return clienteSave;*/