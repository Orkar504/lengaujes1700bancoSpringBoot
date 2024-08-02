package hn.lengaujes1700.unah.jose.martinez.banco.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.lengaujes1700.unah.jose.martinez.banco.Models.Cliente;
import hn.lengaujes1700.unah.jose.martinez.banco.Services.ClienteServicio;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@RequestMapping("/api/banco/cliente")
public class ClienteController {
  
    @Autowired
    private ClienteServicio clienteServicio;
    
    @GetMapping("/prueba")
    public String getMethodName() {
        return "hola cliente";
    }
    

    @GetMapping("/all")
    public List<Cliente> allClientes()
    {
        return this.clienteServicio.getAllClientes();
    }
    @PostMapping("/create")
    public Cliente createCliente(@RequestBody Cliente nvoCliente) {
      return this.clienteServicio.createCliente(nvoCliente);  
    }

    @DeleteMapping("/delete/{id}")
    public String borrarCliente (@PathVariable(name="id") String clienteID)
    {
      return this.clienteServicio.deleteCliente(clienteID);
    }

    /*Cuando hablamos de crear, eliminar o actualizar haremos referencia al Modelo */
    

    

}
