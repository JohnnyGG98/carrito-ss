package com.shopshopista.carritoss.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author gus
 */
@Entity
@Table(
        name = "\"Ventas\"",
        schema = "venta"
)
public class Venta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private Long id_venta;
    
    @Column(
            name = "id_cliente", 
            nullable = false
    )
    private Long id_cliente;
    
    @Column(
            name = "vent_cliente_identificacion", 
            length = 20, 
            columnDefinition="character varying(20) DEFAULT '0000000000'"
    )
    private String vent_cliente_identificacion = "0000000000";
    
    @Column(
            name = "vent_cliente_nombre",
            length = 150, 
            nullable = false,
            columnDefinition="character varying(150) DEFAULT ''"
    )
    private String vent_cliente_nombre = "";
    
    @Column(
            name = "vent_cliente_celular",
            length = 15, 
            columnDefinition="character varying(15) DEFAULT ''"
    )
    private String vent_cliente_celular = "";
    
    @Column(
            name = "vent_cliente_telefono",
            length = 15, 
            columnDefinition="character varying(15) DEFAULT ''"
    )
    private String vent_cliente_telefono = "";
    
    @Column(
            name = "vent_cliente_correo",
            length = 50, 
            columnDefinition="character varying(50) DEFAULT ''"
    )
    private String vent_cliente_correo = "";
    
    @Column(
            name = "vent_cliente_direccion",
            length = 200, 
            columnDefinition="character varying(200) DEFAULT ''"
    )
    private String vent_cliente_direccion = "";
    
    @Column(
            name = "vent_fecha_ingreso",
            columnDefinition="timestamp DEFAULT 'now()'"
    )
    private LocalDateTime vent_fecha_ingreso = ZonedDateTime.now(ZoneId.of("America/Guayaquil")).toLocalDateTime();
    
    @Column(
            name = "vent_subtotal",
            columnDefinition="numeric(15, 5) DEFAULT '0'"
    )
    private double vent_subtotal = 0;
    
    @Column(
            name = "vent_iva",
            columnDefinition="numeric(5, 2) DEFAULT '12'"
    )
    private double vent_iva = 12;
    
    @Column(
            name = "vent_total",
            columnDefinition="numeric(15, 5) DEFAULT '0'"
    )
    private double vent_total = 0;
    
    // Referencias 
    @JsonManagedReference()
    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL)
    private List<DetalleVenta> detalle_venta;
    
    @Column(
            name = "vent_activo",
            nullable = false,
            columnDefinition="boolean DEFAULT 'true'"
    )
    private boolean vent_activo = true;

    public Long getId_venta() {
        return id_venta;
    }

    public void setId_venta(Long id_venta) {
        this.id_venta = id_venta;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getVent_cliente_identificacion() {
        return vent_cliente_identificacion;
    }

    public void setVent_cliente_identificacion(String vent_cliente_identificacion) {
        this.vent_cliente_identificacion = vent_cliente_identificacion;
    }

    public String getVent_cliente_nombre() {
        return vent_cliente_nombre;
    }

    public void setVent_cliente_nombre(String vent_cliente_nombre) {
        this.vent_cliente_nombre = vent_cliente_nombre;
    }

    public String getVent_cliente_celular() {
        return vent_cliente_celular;
    }

    public void setVent_cliente_celular(String vent_cliente_celular) {
        this.vent_cliente_celular = vent_cliente_celular;
    }

    public String getVent_cliente_telefono() {
        return vent_cliente_telefono;
    }

    public void setVent_cliente_telefono(String vent_cliente_telefono) {
        this.vent_cliente_telefono = vent_cliente_telefono;
    }

    public String getVent_cliente_correo() {
        return vent_cliente_correo;
    }

    public void setVent_cliente_correo(String vent_cliente_correo) {
        this.vent_cliente_correo = vent_cliente_correo;
    }

    public String getVent_cliente_direccion() {
        return vent_cliente_direccion;
    }

    public void setVent_cliente_direccion(String vent_cliente_direccion) {
        this.vent_cliente_direccion = vent_cliente_direccion;
    }

    public LocalDateTime getVent_fecha_ingreso() {
        return vent_fecha_ingreso;
    }

    public void setVent_fecha_ingreso(LocalDateTime vent_fecha_ingreso) {
        this.vent_fecha_ingreso = vent_fecha_ingreso;
    }

    public double getVent_subtotal() {
        return vent_subtotal;
    }

    public void setVent_subtotal(double vent_subtotal) {
        this.vent_subtotal = vent_subtotal;
    }

    public double getVent_iva() {
        return vent_iva;
    }

    public void setVent_iva(double vent_iva) {
        this.vent_iva = vent_iva;
    }

    public double getVent_total() {
        return vent_total;
    }

    public void setVent_total(double vent_total) {
        this.vent_total = vent_total;
    }

    public boolean isVent_activo() {
        return vent_activo;
    }

    public void setVent_activo(boolean vent_activo) {
        this.vent_activo = vent_activo;
    }

    public List<DetalleVenta> getDetalle_venta() {
        return detalle_venta;
    }

    public void setDetalle_venta(List<DetalleVenta> detalle_venta) {
        this.detalle_venta = detalle_venta;
    }
    
    
}
