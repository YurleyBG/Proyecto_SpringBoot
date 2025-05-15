package com.example.jyv_tools.Domain.Entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Detalles_Proveedores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nit;
    private String Nombre_empresa;
    private String direccion, telefono;
    private String Correo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_proveedor",nullable = false)
    private Usuarios usuario;


    public Detalles_Proveedores() {
    }

    public Detalles_Proveedores(String Correo, String Nombre_empresa, String direccion, Long id, String nit, String telefono) {
        this.Correo = Correo;
        this.Nombre_empresa = Nombre_empresa;
        this.direccion = direccion;
        this.id = id;
        this.nit = nit;
        this.telefono = telefono;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre_empresa() {
        return Nombre_empresa;
    }

    public void setNombre_empresa(String Nombre_empresa) {
        this.Nombre_empresa = Nombre_empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }


    
}
