package com.example.NebulaMusic.model;

public class Usuario {
    private String txt_nombre;
    private String txt_correo;
    private String txt_contrasenia;
    private String txt_pseudonimo;
    private String rad_genero;

    public Usuario() {
    }

    public Usuario(String txt_nombre, String txt_correo, String txt_contrasenia, String txt_pseudonimo, String rad_genero) {
        this.txt_nombre = txt_nombre;
        this.txt_correo = txt_correo;
        this.txt_contrasenia = txt_contrasenia;
        this.txt_pseudonimo = txt_pseudonimo;
        this.rad_genero = rad_genero;
    }

    public String getTxt_nombre() {
        return txt_nombre;
    }

    public void setTxt_nombre(String txt_nombre) {
        this.txt_nombre = txt_nombre;
    }

    public String getTxt_correo() {
        return txt_correo;
    }

    public void setTxt_correo(String txt_correo) {
        this.txt_correo = txt_correo;
    }

    public String getTxt_contrasenia() {
        return txt_contrasenia;
    }

    public void setTxt_contrasenia(String txt_contrasenia) {
        this.txt_contrasenia = txt_contrasenia;
    }

    public String getTxt_pseudonimo() {
        return txt_pseudonimo;
    }

    public void setTxt_pseudonimo(String txt_pseudonimo) {
        this.txt_pseudonimo = txt_pseudonimo;
    }

    public String getRad_genero() {
        return rad_genero;
    }

    public void setRad_genero(String rad_genero) {
        this.rad_genero = rad_genero;
    }
}