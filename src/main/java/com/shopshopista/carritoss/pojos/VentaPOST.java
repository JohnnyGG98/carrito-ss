package com.shopshopista.carritoss.pojos;

import java.util.List;

/**
 *
 * @author gus
 */
public class VentaPOST {

    private long id_cliente;

    private List<DetalleVentaPOST> detalle;

    public long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public List<DetalleVentaPOST> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<DetalleVentaPOST> detalle) {
        this.detalle = detalle;
    }

}
