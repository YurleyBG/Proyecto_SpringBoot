package com.example.jyv_tools.Infraestructura.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;

@Controller
public class HomeController {
    @GetMapping("/Home")
    public String index(Model model) {
        return "PaginaInicio"; 
    }
}
