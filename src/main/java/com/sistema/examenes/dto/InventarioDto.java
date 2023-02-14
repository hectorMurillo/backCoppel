package com.sistema.examenes.dto;

public class InventarioDto {
    private Long SKU;
    private String nombre;

    public InventarioDto() {
    }

    public InventarioDto(Long SKU, String nombre) {
        this.SKU = SKU;
        this.nombre = nombre;
    }

    public Long getSKU() {
        return SKU;
    }

    public void setSKU(Long SKU) {
        this.SKU = SKU;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
