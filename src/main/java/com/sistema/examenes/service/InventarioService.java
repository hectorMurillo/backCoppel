package com.sistema.examenes.service;

import com.sistema.examenes.entity.Inventario;

import java.util.List;

public interface InventarioService {
    //public Inventario guardarInventario(Inventario inventario) throws Exception;
    public Inventario obtenerInventario(Long sku);
    public List<Inventario> obtenerInventarios();
}
