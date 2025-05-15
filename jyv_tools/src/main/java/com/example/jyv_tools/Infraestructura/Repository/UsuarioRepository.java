package com.example.jyv_tools.Infraestructura.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jyv_tools.Domain.Entities.Usuarios;

public interface UsuarioRepository extends JpaRepository<Usuarios , Long> {

    

}
