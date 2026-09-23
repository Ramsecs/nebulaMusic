package com.example.NebulaMusic.service;

import com.example.NebulaMusic.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private List<Usuario> listaUsuarios = new ArrayList<>();

    public void guardarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public List<Usuario> obtenerUsuarios() {
        return listaUsuarios;
    }

    public boolean autenticar(String correo, String contrasenia) {
        for (Usuario u : listaUsuarios) {
            if (u.getTxt_correo().equals(correo) && u.getTxt_contrasenia().equals(contrasenia)) {
                return true;
            }
        }
        return false;
    }

    public Usuario buscarPorCorreo(String correo) {
        for (Usuario u : listaUsuarios) {
            if (u.getTxt_correo().equals(correo)) {
                return u;
            }
        }
        return null;
    }
}