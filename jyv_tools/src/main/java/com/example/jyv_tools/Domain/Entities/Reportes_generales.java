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
public class Reportes_generales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp fecha;
    private BigDecimal Ingreso;
    private String Herramienta_Mas_alquilado;
    private int total_alquileres;

    @OneToOne
    @JoinColumn(name = "reserva_id")
    private Reservas reserva;



    public Reportes_generales() {
    }

    public Reportes_generales(String Herramienta_Mas_alquilado, BigDecimal Ingreso, Timestamp fecha, Long id, int total_alquileres) {
        this.Herramienta_Mas_alquilado = Herramienta_Mas_alquilado;
        this.Ingreso = Ingreso;
        this.fecha = fecha;
        this.id = id;
        this.total_alquileres = total_alquileres;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getIngreso() {
        return Ingreso;
    }

    public void setIngreso(BigDecimal Ingreso) {
        this.Ingreso = Ingreso;
    }

    public String getHerramienta_Mas_alquilado() {
        return Herramienta_Mas_alquilado;
    }

    public void setHerramienta_Mas_alquilado(String Herramienta_Mas_alquilado) {
        this.Herramienta_Mas_alquilado = Herramienta_Mas_alquilado;
    }

    public int getTotal_alquileres() {
        return total_alquileres;
    }

    public void setTotal_alquileres(int total_alquileres) {
        this.total_alquileres = total_alquileres;
    }

    public Reservas getReserva() {
        return reserva;
    }

    public void setReserva(Reservas reserva) {
        this.reserva = reserva;
    }
    

}
