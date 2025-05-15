package com.example.jyv_tools.Infraestructura.Controllers.Usuario;


import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jyv_tools.Domain.Entities.Usuarios;
import com.example.jyv_tools.aplication.Server.UsuarioServer;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(value="/api" ,produces = MediaType.APPLICATION_JSON_VALUE)
public class UsuarioController {

    private final UsuarioServer usuarioservicio;

    public UsuarioController(UsuarioServer usuarioservicio) {
        this.usuarioservicio = usuarioservicio;
    }

    @GetMapping("/usuarios")
    public List<Usuarios> findAll() {
        List<Usuarios> userResult= usuarioservicio.findAllUsers();
        return userResult;
    }
    



}
