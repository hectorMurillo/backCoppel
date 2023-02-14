package com.sistema.examenes.service.impl;

import com.sistema.examenes.entity.Inventario;
import com.sistema.examenes.repository.InventarioRepository;
import com.sistema.examenes.service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioServiceImpl implements InventarioService {
    @Autowired
    private InventarioRepository inventarioRepository;

    /*@Override
    public Inventario guardarInventario(Inventario inventario) {
        return null;
    }*/

    @Override
    public Inventario obtenerInventario(Long sku) {
        return inventarioRepository.findBySKU(sku);
    }
    public List<Inventario> obtenerInventarios(){
        return inventarioRepository.findAll();
    }
}
