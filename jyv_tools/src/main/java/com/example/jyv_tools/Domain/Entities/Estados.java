package com.example.jyv_tools.Domain.Entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Estados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Nombre;

    @OneToMany(mappedBy="estados",fetch= FetchType.EAGER)
    private List<Reservas> reservas ;

    @OneToMany(mappedBy = "estado")
    private List<HerramientasMantenimiento> mantenimientos;

    @OneToMany(mappedBy = "estado")
    private List<Devoluciones> devoluciones;

    public Estados(String Nombre, Long id) {
        this.Nombre = Nombre;
        this.id = id;
    }

    public Estados() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public List<Reservas> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reservas> reservas) {
        this.reservas = reservas;
    }

    public List<HerramientasMantenimiento> getMantenimientos() {
        return mantenimientos;
    }

    public void setMantenimientos(List<HerramientasMantenimiento> mantenimientos) {
        this.mantenimientos = mantenimientos;
    }

    public List<Devoluciones> getDevoluciones() {
        return devoluciones;
    }

    public void setDevoluciones(List<Devoluciones> devoluciones) {
        this.devoluciones = devoluciones;
    }


    

}
