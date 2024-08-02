package hn.lengaujes1700.unah.jose.martinez.banco.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lengaujes1700.unah.jose.martinez.banco.Models.Cliente;
import hn.lengaujes1700.unah.jose.martinez.banco.Repositories.ClienteRepository;

@Service
/*Solo realiza llamados a la logica */
public class ClienteServicio {

    @Autowired /*Inyeccion que hace que spring agregue las dependencias necesarias */
    private ClienteRepository clienteRepository;

    public List<Cliente> getAllClientes()
    {
        return this.clienteRepository.findAll();
       
    }

    public Cliente createCliente(Cliente nvocliente)
    {
        return this.clienteRepository.save(nvocliente);

    }

    public Cliente deleteCliente()
    {
        return null;

    }
}
