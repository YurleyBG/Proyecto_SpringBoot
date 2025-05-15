package com.example.jyv_tools.aplication.Server;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.jyv_tools.Domain.Entities.Usuarios;

@Service
public interface UsuarioServer {

    public List<Usuarios>findAllUsers();

    
} 
