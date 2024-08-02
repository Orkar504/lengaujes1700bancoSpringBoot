package hn.lengaujes1700.unah.jose.martinez.banco.Models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name="direccion")
@Data
public class Direccion {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="codigodireccion")
private Integer id ;
private String ciudad;
private String departamento;
private String calle;

/*Esta es una relacon Unidireccional
 * 
 * donde hacemos referenia a la entidad Cliente
 * Osea el modelo
 * Tambien debemos hacer esto 
 * en el modelo del cliente para que la relaccion
 * deje de ser unidireccional y se convierta 
 * en bidireccional
 */

@JsonIgnore /*Evita la recursion infinita */
@OneToOne
@JoinColumn(name = "dni",referencedColumnName = "dni")
private Cliente cliente;

/*
No se realiza este campo porque realizaremos un mapeo
private String dni;

*/
}
