package com.sistema.examenes.repository;

import com.sistema.examenes.entity.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface InventarioRepository extends JpaRepository<Inventario,Long> {
    public Inventario findBySKU(Long sku);
    public List<Inventario> findAll();
}
