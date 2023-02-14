package com.sistema.examenes.service;

import com.sistema.examenes.entity.Usuario;
import com.sistema.examenes.entity.UsuarioRol;

import java.util.Optional;
import java.util.Set;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long usuarioId);
}
