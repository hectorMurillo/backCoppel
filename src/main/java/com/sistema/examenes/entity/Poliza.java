package com.sistema.examenes.entity;

import com.sistema.examenes.dto.PolizaDto;
import com.sistema.examenes.service.PolizaService;
import com.sistema.examenes.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="polizas")
public class Poliza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPoliza;
    @ManyToOne(fetch = FetchType.EAGER)
    private Usuario empleadoGenero;
    @ManyToOne(fetch = FetchType.EAGER)
    private Inventario sku;
    private Integer cantidad;
    private Date fecha;
    private String cliente;

    public Poliza() {
        super();
    }

    public Long getIdPoliza() {
        return idPoliza;
    }

    public void setIdPoliza(Long idPoliza) {
        this.idPoliza = idPoliza;
    }

    public Usuario getEmpleadoGenero() {
        return empleadoGenero;
    }

    public void setEmpleadoGenero(Usuario empleadoGenero) {
        this.empleadoGenero = empleadoGenero;
    }

    public Inventario getSku() {
        return sku;
    }

    public void setSku(Inventario sku) {
        this.sku = sku;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }


}
