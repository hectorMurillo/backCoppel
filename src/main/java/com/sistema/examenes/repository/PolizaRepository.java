package com.sistema.examenes.repository;

import com.sistema.examenes.dto.PolizaDto;
import com.sistema.examenes.entity.Poliza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PolizaRepository extends JpaRepository<Poliza,Long> {
    public Poliza findByIdPoliza(Long idPoliza);
    public List<Poliza> findAll();

}
