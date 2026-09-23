package com.example.NebulaMusic.controller;

import com.example.NebulaMusic.model.Usuario;
import com.example.NebulaMusic.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping({"/", "/index", "/index.html"})
    public String index() {
        return "index";
    }

    @GetMapping({"/iniciar-sesion", "/iniciar-sesion.html"})
    public String login() {
        return "iniciar-sesion";
    }

    @GetMapping({"/registro", "/registro.html"})
    public String registro() {
        return "registro";
    }

    @PostMapping("/crear-cuenta")
    public String crearCuenta(@ModelAttribute Usuario usuario) {
        usuarioService.guardarUsuario(usuario);
        return "redirect:/iniciar-sesion";
    }

    @PostMapping("/autentication")
    public String autenticar(@RequestParam("correo") String correo, @RequestParam("contrasenia") String contrasenia) {
        if (usuarioService.autenticar(correo, contrasenia)) {
            return "redirect:/index";
        }
        return "redirect:/iniciar-sesion?error=true";
    }
}