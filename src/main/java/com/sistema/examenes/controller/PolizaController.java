package com.sistema.examenes.controller;

import com.sistema.examenes.dto.PolizaDto;
import com.sistema.examenes.entity.Poliza;
import com.sistema.examenes.global.dto.MessageDto;
import com.sistema.examenes.global.exceptions.AttributeException;
import com.sistema.examenes.global.exceptions.ResourceNotFoundException;
import com.sistema.examenes.service.PolizaService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/polizas")
@CrossOrigin("*")
public class PolizaController {
    private static final Logger logger = LoggerFactory.getLogger(PolizaController.class);
    @Autowired
    private PolizaService polizaService;
    @GetMapping("/")
    public List<Poliza> obtenerPolizas(){
        return polizaService.obtenerPolizas();
    }

    @GetMapping("/{idPoliza}")
    public ResponseEntity<PolizaDto> obtenerPoliza(@PathVariable("idPoliza") Long idPoliza) throws ResourceNotFoundException {
        PolizaDto poliza = polizaService.obtenerPoliza(idPoliza);
        //return new ResponseFormat<Poliza>(new MetaResponse((HttpStatus.OK).toString()),new DataResponse<Poliza>(poliza));
        return ResponseEntity.ok(poliza);
    }

    @PostMapping
    public ResponseEntity<MessageDto> guardarPoliza(@RequestBody PolizaDto dto) throws AttributeException{
        Poliza poliza = polizaService.guardarPoliza(dto);
        String mssg = "poliza " + poliza.getIdPoliza() + " ha sido guardada con éxito";
        logger.info(mssg);
        return ResponseEntity.ok(new MessageDto(HttpStatus.OK, mssg));
    }

    @PutMapping("/{id}")
    public ResponseEntity<MessageDto> actualizarPoliza(@PathVariable("id") Long id, @RequestBody PolizaDto dto) throws ResourceNotFoundException, AttributeException{
        Poliza poliza = polizaService.actualizar(id,dto);
        String mssg="poliza " + poliza.getIdPoliza() + " ha sido actualizada con éxito";
        logger.info(mssg);
        return ResponseEntity.ok(new MessageDto(HttpStatus.OK, mssg));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MessageDto> delete(@PathVariable("id") Long id) throws ResourceNotFoundException{
        Poliza poliza = polizaService.eliminar(id);
        String mssg = "poliza "+poliza.getIdPoliza()+" ha sido eliminada";
        logger.info(mssg);
        return ResponseEntity.ok(new MessageDto(HttpStatus.OK, mssg));
    }

}
