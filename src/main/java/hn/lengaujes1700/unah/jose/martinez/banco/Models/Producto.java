package hn.lengaujes1700.unah.jose.martinez.banco.Models;


import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table (name="productoS")
@Data
public class Producto {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigoProducto")
    private Integer codigoProducto;
    private String descripcion;
    @Column(name="fechaapertura")
    private LocalDate fechaApertura;
    private double saldo;
    
    @JsonIgnore
    @ManyToOne /*Varios Productos un mismo cliente */
    @JoinColumn(name="dni", referencedColumnName = "dni")
    private Cliente cliente;

}

