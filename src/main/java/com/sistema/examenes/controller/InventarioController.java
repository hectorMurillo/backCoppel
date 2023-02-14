package com.sistema.examenes.controller;

import com.sistema.examenes.entity.Inventario;
import com.sistema.examenes.service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventarios")
@CrossOrigin("*")
public class InventarioController {
    @Autowired
    private InventarioService inventarioService;

    @GetMapping("/")
    public List<Inventario> obtenerInventarios(){
        return inventarioService.obtenerInventarios();
    }
    @GetMapping("/{sku}")
    public Inventario obtenerInventario(@PathVariable("sku") Long sku){
        return inventarioService.obtenerInventario(sku);
    }
}
