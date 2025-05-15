package com.example.jyv_tools.Domain.Entities;

import java.sql.Timestamp;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Alquiler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp fecha_alquiler,fecha_esperando,fecha_entrega;
    private String estado ;

    @ManyToOne
    @JoinColumn(name = "id_reserva")
    private Reservas reserva;

    @ManyToOne
    @JoinColumn(name = "id_herramienta")
    private Herramientas herramienta;

    @OneToOne(mappedBy = "alquiler", cascade = CascadeType.ALL)
    private Entregas entrega;

    @OneToMany(mappedBy = "alquiler")
    private List<Devoluciones> devoluciones;

    public Alquiler(String estado, Timestamp fecha_alquiler, Timestamp fecha_entrega, Timestamp fecha_esperando, Long id) {
        this.estado = estado;
        this.fecha_alquiler = fecha_alquiler;
        this.fecha_entrega = fecha_entrega;
        this.fecha_esperando = fecha_esperando;
        this.id = id;
    }

    public Alquiler() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getFecha_alquiler() {
        return fecha_alquiler;
    }

    public void setFecha_alquiler(Timestamp fecha_alquiler) {
        this.fecha_alquiler = fecha_alquiler;
    }

    public Timestamp getFecha_esperando() {
        return fecha_esperando;
    }

    public void setFecha_esperando(Timestamp fecha_esperando) {
        this.fecha_esperando = fecha_esperando;
    }

    public Timestamp getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Timestamp fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Reservas getReserva() {
        return reserva;
    }

    public void setReserva(Reservas reserva) {
        this.reserva = reserva;
    }

    public Herramientas getHerramienta() {
        return herramienta;
    }

    public void setHerramienta(Herramientas herramienta) {
        this.herramienta = herramienta;
    }

    public Entregas getEntrega() {
        return entrega;
    }

    public void setEntrega(Entregas entrega) {
        this.entrega = entrega;
    }

    public List<Devoluciones> getDevoluciones() {
        return devoluciones;
    }

    public void setDevoluciones(List<Devoluciones> devoluciones) {
        this.devoluciones = devoluciones;
    }





}
