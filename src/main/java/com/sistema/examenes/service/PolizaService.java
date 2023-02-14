package com.sistema.examenes.service;

import com.sistema.examenes.dto.PolizaDto;
import com.sistema.examenes.entity.Poliza;
import com.sistema.examenes.global.exceptions.AttributeException;
import com.sistema.examenes.global.exceptions.ResourceNotFoundException;

import java.util.List;

public interface PolizaService {
    public List<Poliza> obtenerPolizas();

    public PolizaDto obtenerPoliza(Long idPoliza);

    public Poliza guardarPoliza(PolizaDto dto) throws AttributeException;

    Poliza actualizar(Long id, PolizaDto dto) throws ResourceNotFoundException,AttributeException;

    Poliza eliminar(Long id) throws ResourceNotFoundException;
}