package hn.lengaujes1700.unah.jose.martinez.banco.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.lengaujes1700.unah.jose.martinez.banco.Models.Cliente;

/*Siempre es necesario colocar el modelo y el tipo de la llave primaria */

/*Aqui va la logica */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente,String> 
{


}
