package hn.lengaujes1700.unah.jose.martinez.banco.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.lengaujes1700.unah.jose.martinez.banco.Models.Producto;
/*El repositorio es para obtener, eliminar o verificar datos */
/*Aqui va la logica de los llamados a la base de datos etc.. */
@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer>{



}
