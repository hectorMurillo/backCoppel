package com.sistema.examenes.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UsuarioDto {

    private  String username;
    private String nombre;
    private String apellido;

    public UsuarioDto() {
    }

    public UsuarioDto(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
