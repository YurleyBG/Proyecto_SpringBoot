package com.example.jyv_tools.Domain.Entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Categorias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Nombre;
    private String Descripcion;

    @OneToMany(mappedBy = "categoria")
    private List<Herramientas> herramientas;


    public Categorias() {
    }

    public Categorias(String Descripcion, String Nombre, Long id) {
        this.Descripcion = Descripcion;
        this.Nombre = Nombre;
        this.id = id;
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

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public List<Herramientas> getHerramientas() {
        return herramientas;
    }

    public void setHerramientas(List<Herramientas> herramientas) {
        this.herramientas = herramientas;
    }

    
}
