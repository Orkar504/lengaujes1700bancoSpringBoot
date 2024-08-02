package hn.lengaujes1700.unah.jose.martinez.banco.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.lengaujes1700.unah.jose.martinez.banco.Models.Direccion;

/*El repositorio es para obtener, eliminar o verificar datos */
@Repository
/*Aqui va la logica */
public interface DireccionRepository extends JpaRepository<Direccion,Integer> {



}
