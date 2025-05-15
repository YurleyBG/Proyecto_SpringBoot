package com.example.jyv_tools.Domain.Entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Herramientas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String UrlImage;

    @OneToMany(mappedBy="herramienta",fetch= FetchType.EAGER)
    private List<Reservas> reservas ;

    @ManyToOne
    @JoinColumn(name = "id_inventario")
    private Inventario inventario;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categorias categoria;

    @OneToMany(mappedBy = "herramienta")
    private List<HerramientasMantenimiento> mantenimientos;

    @OneToMany(mappedBy = "herramienta")
    private List<Notificaciones> notificaciones;

    @OneToMany(mappedBy = "herramienta")
    private List<Alquiler> alquileres;




    public Herramientas() {
    }

    public Herramientas(String UrlImage, Long id, String nombre) {
        this.UrlImage = UrlImage;
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrlImage() {
        return UrlImage;
    }

    public void setUrlImage(String UrlImage) {
        this.UrlImage = UrlImage;
    }

    public List<Reservas> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reservas> reservas) {
        this.reservas = reservas;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public List<HerramientasMantenimiento> getMantenimientos() {
        return mantenimientos;
    }

    public void setMantenimientos(List<HerramientasMantenimiento> mantenimientos) {
        this.mantenimientos = mantenimientos;
    }

    public List<Notificaciones> getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(List<Notificaciones> notificaciones) {
        this.notificaciones = notificaciones;
    }

    public List<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(List<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }

    




}
