package com.shopshopista.carritoss.pojos.RQ;

import java.time.LocalDateTime;

/**
 *
 * @author gus
 */
public interface VentasRQ {

    /*long id_venta;
    LocalDateTime vent_fecha_ingreso; 
    double vent_subtotal;
    double vent_total;
    int num_productos;*/
    long getId_venta();

    LocalDateTime getVent_fecha_ingreso();

    double getVent_subtotal();

    double getVent_total();

    int getNum_productos();
}
