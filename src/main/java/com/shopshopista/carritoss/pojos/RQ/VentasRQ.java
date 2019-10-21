package com.shopshopista.carritoss.pojos.RQ;

import java.time.LocalDateTime;

/**
 *
 * @author gus
 */
public interface VentasRQ {

    long getId_venta();

    LocalDateTime getVent_fecha_ingreso();

    double getVent_subtotal_iva();
    
    double getVent_subtotal_sin_iva();
    
    double getVent_total_iva();

    double getVent_total();

    int getNum_productos();
}
