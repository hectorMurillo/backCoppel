package com.sistema.examenes.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name="inventarios")
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long SKU;
    private String nombre;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String cantidad;
    //@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "inventario")
    //@JsonIgnore

    public Inventario(){

    }

    public Inventario(Long SKU, String nombre, String cantidad) {
        this.SKU = SKU;
        this.nombre = nombre;
        this.cantidad = cantidad;
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

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
