package com.shopshopista.carritoss.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author gus
 */
@Entity
@Table(
        name = "\"DetalleVenta\"",
        schema = "venta"
        
)
public class DetalleVenta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_venta")
    private Long id_detalle_venta;
    
    // Foraneas 
    @JsonBackReference
    @JoinColumn(name = "id_venta")
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Venta venta;
    
    @Column(
            name = "id_producto", 
            nullable = false
    )
    private Long id_producto;
    
    // Columnas
    
    @Column(
            name = "deve_num_producto", 
            columnDefinition = "integer DEFAULT '0'"
    )
    private int deve_num_producto = 0;
    
    @Column(
            name = "deve_precio_unitario", 
            columnDefinition = "numeric(10, 5) DEFAULT '0'"
    )
    private double deve_precio_unitario = 0;
    
    @Column(
            name = "deve_total", 
            columnDefinition = "numeric(15, 5) DEFAULT '0'"
    )
    private double deve_total = 0;
    
    @Column(
            name = "deve_activo",
            columnDefinition="boolean DEFAULT 'true'"
    )
    private boolean deve_activo = true; 

    public Long getId_detalle_venta() {
        return id_detalle_venta;
    }

    public void setId_detalle_venta(Long id_detalle_venta) {
        this.id_detalle_venta = id_detalle_venta;
    }

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
    }

    public int getDeve_num_producto() {
        return deve_num_producto;
    }

    public void setDeve_num_producto(int deve_num_producto) {
        this.deve_num_producto = deve_num_producto;
    }

    public double getDeve_precio_unitario() {
        return deve_precio_unitario;
    }

    public void setDeve_precio_unitario(double deve_precio_unitario) {
        this.deve_precio_unitario = deve_precio_unitario;
    }

    public double getDeve_total() {
        return deve_total;
    }

    public void setDeve_total(double deve_total) {
        this.deve_total = deve_total;
    }

    public boolean isDeve_activo() {
        return deve_activo;
    }

    public void setDeve_activo(boolean deve_activo) {
        this.deve_activo = deve_activo;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }
    
}
