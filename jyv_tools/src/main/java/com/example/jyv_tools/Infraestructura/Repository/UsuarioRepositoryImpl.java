package com.example.jyv_tools.Infraestructura.Repository;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.jyv_tools.Domain.Entities.Usuarios;
import com.example.jyv_tools.aplication.Server.UsuarioServer;

@Service
public class UsuarioRepositoryImpl implements UsuarioServer {


    private final UsuarioRepository usuarioRepository;

    public UsuarioRepositoryImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }



    @Override
    public List<Usuarios> findAllUsers() {
        
        return usuarioRepository.findAll();
    }

}
