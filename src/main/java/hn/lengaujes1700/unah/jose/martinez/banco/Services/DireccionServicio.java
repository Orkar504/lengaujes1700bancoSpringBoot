package hn.lengaujes1700.unah.jose.martinez.banco.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lengaujes1700.unah.jose.martinez.banco.Models.Direccion;
import hn.lengaujes1700.unah.jose.martinez.banco.Repositories.DireccionRepository;

/*Aqui va la logica del programa */

@Service
public class DireccionServicio {

    @Autowired
    private DireccionRepository direccionRepository;

    public List<Direccion>  getAllDirecciones()
    {
        return this.direccionRepository.findAll();
    }

    public Direccion createDireccion(Direccion nvaDireccion)
    {

        return this.direccionRepository.save(nvaDireccion);
    }

    /* Exist by id para encotrar campos */
    public boolean direccionExist(Integer Id)
    {
        return this.direccionRepository.existsById(Id);
    }

    public String deleteByIdDireccion(Integer id)
    {
        if(this.direccionRepository.existsById(id))
        {
        this.direccionRepository.deleteById(id);
         return "Se ha eliminado la direccion";

        }
        else
        {
            return null;
        }
         
    }

}
