package com.example.jyv_tools.Domain.Entities;

import java.math.BigDecimal;
import java.sql.Timestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Reservas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp fecha_inicio , fecha_fin;
    private BigDecimal costo_total;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_Cliente",nullable = false)
    private Usuarios Users;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_Estado",nullable = false)
    private Estados estados;
    @ManyToOne
    @JoinColumn(name = "id_Herramienta")
    private Herramientas herramienta;


    public Reservas(BigDecimal costo_total, Timestamp fecha_fin, Timestamp fecha_inicio, Long id) {
        this.costo_total = costo_total;
        this.fecha_fin = fecha_fin;
        this.fecha_inicio = fecha_inicio;
        this.id = id;
    }

    public Reservas() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Timestamp fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Timestamp getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Timestamp fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public BigDecimal getCosto_total() {
        return costo_total;
    }

    public void setCosto_total(BigDecimal costo_total) {
        this.costo_total = costo_total;
    }

    public Usuarios getUsers() {
        return Users;
    }

    public void setUsers(Usuarios Users) {
        this.Users = Users;
    }

    public Estados getEstados() {
        return estados;
    }

    public void setEstados(Estados estados) {
        this.estados = estados;
    }

    public Herramientas getHerramienta() {
        return herramienta;
    }

    public void setHerramienta(Herramientas herramienta) {
        this.herramienta = herramienta;
    }





}
