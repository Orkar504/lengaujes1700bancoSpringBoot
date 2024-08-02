package hn.lengaujes1700.unah.jose.martinez.banco.Models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="cliente")
@Data
public class Cliente {

@Id
private String dni;

private String nombre;

private String apellido;

private String correo;

private String telefono;

/*Aunque no exista una relacion directa 
 * direccion que haga una referencia a direccion
 * utilizamos mappedBy para demostrar que objetos
 * es el que esta mapeando 
 */

 /*El cascade all permite insertar los otros objetos enviados por El Json 
  * en la tabla y asi no debemos quitar el JSON ignore
  */
@OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL)
private Direccion direccion;

/*Un cliente, varios Productos */
@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
private List<Producto> producto;


}