package hn.lengaujes1700.unah.jose.martinez.banco.Models;

import java.security.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table (name="")
@Data
public class Producto {

    
    @Id
    @Column(name="codigoProducto")
    private Integer codigoProducto;
    private String descripcion;
    private Timestamp fechaApertura;
    private Float saldo;
    private String dni;

}
