package hn.lengaujes1700.unah.jose.martinez.banco.Controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.lengaujes1700.unah.jose.martinez.banco.Models.Direccion;

import hn.lengaujes1700.unah.jose.martinez.banco.Services.DireccionServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/*El controlador llama a los servicios  */
@RestController
@RequestMapping("api/banco/direccion")


public class DireccionController {
    /* NO VA A FUNCIONAR AL 100 YA QUE ES UNA RELACION BIDIRECCIONAL */
    @Autowired
    private DireccionServicio direccionServicio;

    @GetMapping("/all")    
    public List<Direccion> getAllDireccions()
    {
       return this.getAllDireccions();
    }

    @GetMapping("/prueba")
    public String prueba() {
        return "Prueba Direccion";
    }
    

     /* Cuando se crea un objeto se debe pedir el objeto como tal*/
    @PostMapping("/create")
    public Direccion createDireccion(@RequestBody Direccion direccion ) {
        return this.direccionServicio.createDireccion(direccion);
    }

    @DeleteMapping("/delete/{ID}")
    public String borrarDireccio(@RequestParam("name=ID") Integer id)
    {
        return this.direccionServicio.deleteByIdDireccion(id);
    }
   
    

}
