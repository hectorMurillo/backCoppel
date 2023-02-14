package com.sistema.examenes.service.impl;
import com.sistema.examenes.dto.InventarioDto;
import com.sistema.examenes.dto.PolizaDto;
import com.sistema.examenes.dto.UsuarioDto;
import com.sistema.examenes.entity.Poliza;
import com.sistema.examenes.global.exceptions.AttributeException;
import com.sistema.examenes.global.exceptions.ResourceNotFoundException;
import com.sistema.examenes.repository.InventarioRepository;
import com.sistema.examenes.repository.PolizaRepository;
import com.sistema.examenes.service.InventarioService;
import com.sistema.examenes.service.PolizaService;
import com.sistema.examenes.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.*;
@Service
public class PolizaServiceImpl implements PolizaService {
    @Autowired
    private PolizaRepository polizaRepository;
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private InventarioService inventarioService;
    @Autowired
    private InventarioRepository inventarioRepository;

    @Override
    public List<Poliza> obtenerPolizas() {
        return polizaRepository.findAll();
    }

    @Override
    public PolizaDto obtenerPoliza(Long idPoliza) {
        Poliza poliza = polizaRepository.findByIdPoliza(idPoliza);
        return  new PolizaDto(poliza.getIdPoliza(),new UsuarioDto(poliza.getEmpleadoGenero().getNombre(),poliza.getEmpleadoGenero().getApellido()),
                                new InventarioDto(poliza.getSku().getSKU(),poliza.getSku().getNombre()),poliza.getCantidad(),poliza.getFecha(),poliza.getCliente());
    }


    @Override
    public Poliza guardarPoliza(PolizaDto dto) throws AttributeException {
        if(polizaRepository.existsById(dto.getIdPoliza()))
            throw new AttributeException("Esta póliza ya existe");

        Poliza poliza = new Poliza();
        poliza.setEmpleadoGenero(usuarioService.obtenerUsuario(dto.getEmpleadoGenero().getUsername()));
        poliza.setSku(inventarioService.obtenerInventario(dto.getDetalleArticulo().getSKU()));
        poliza.setCantidad(dto.getCantidad());
        poliza.setFecha(dto.getFecha());
        poliza.setCliente(dto.getCliente());
        return polizaRepository.save(poliza);
    }

    @Override
    public Poliza actualizar(Long id, PolizaDto dto) throws ResourceNotFoundException, AttributeException {
        Poliza poliza = polizaRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("not found"));
        poliza.setCliente(dto.getCliente());
        return polizaRepository.save(poliza);
    }

    @Override
    public Poliza eliminar(Long id) throws ResourceNotFoundException {
        Poliza poliza = polizaRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("not found"));
        polizaRepository.delete(poliza);
        return poliza;
    }

}
