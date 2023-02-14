package com.sistema.examenes.dto;
import com.sistema.examenes.entity.Inventario;
import com.sistema.examenes.entity.Usuario;
import java.util.Date;

public class PolizaDto{
    private Long idPoliza;
    private UsuarioDto empleado;
    private InventarioDto detalleArticulo;
    private Integer cantidad;
    private Date fecha;
    private String cliente;

    public PolizaDto(Long idPoliza, UsuarioDto empleado, InventarioDto detalleArticulo, Integer cantidad, Date fecha, String cliente) {
        this.idPoliza = idPoliza;
        this.empleado = empleado;
        this.detalleArticulo = detalleArticulo;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public Long getIdPoliza() {
        return idPoliza;
    }

    public void setIdPoliza(Long idPoliza) {
        this.idPoliza = idPoliza;
    }

    public UsuarioDto getEmpleadoGenero() {
        return empleado;
    }

    public void setEmpleadoGenero(UsuarioDto empleadoGenero) {
        this.empleado = empleadoGenero;
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

    public UsuarioDto getEmpleado() {
        return empleado;
    }

    public void setEmpleado(UsuarioDto empleado) {
        this.empleado = empleado;
    }

    public InventarioDto getDetalleArticulo() {
        return detalleArticulo;
    }

    public void setDetalleArticulo(InventarioDto detalleArticulo) {
        this.detalleArticulo = detalleArticulo;
    }
}