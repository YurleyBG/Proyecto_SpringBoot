package com.example.jyv_tools.Domain.Entities;

import java.math.BigDecimal;
import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Entregas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Estado, direccion_entrega;
    private BigDecimal Costo;
    private Timestamp fecha;

    @OneToOne
    @JoinColumn(name = "id_alquiler")
    private Alquiler alquiler;


    public Entregas() {
    }

    public Entregas(BigDecimal Costo, String Estado, String direccion_entrega, Timestamp fecha, Long id) {
        this.Costo = Costo;
        this.Estado = Estado;
        this.direccion_entrega = direccion_entrega;
        this.fecha = fecha;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getDireccion_entrega() {
        return direccion_entrega;
    }

    public void setDireccion_entrega(String direccion_entrega) {
        this.direccion_entrega = direccion_entrega;
    }

    public BigDecimal getCosto() {
        return Costo;
    }

    public void setCosto(BigDecimal Costo) {
        this.Costo = Costo;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }

    

    
    

}
