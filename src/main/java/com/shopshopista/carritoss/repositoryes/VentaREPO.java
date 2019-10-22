package com.shopshopista.carritoss.repositoryes;

import com.shopshopista.carritoss.models.Venta;
import com.shopshopista.carritoss.pojos.RQ.VentasRQ;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gus
 */
@Repository
public interface VentaREPO extends JpaRepository<Venta, Long> {

    @Query(
            value = "SELECT "
            + " v.id_venta AS id_venta, "
            + " v.vent_fecha_ingreso AS vent_fecha_ingreso, "
            + " COALESCE(v.vent_subtotal_iva, 0.0) AS vent_subtotal_iva, "
            + " COALESCE(v.vent_subtotal_sin_iva, 0.0) AS vent_subtotal_sin_iva, "
            + " COALESCE(v.vent_total_iva, 0.0) AS vent_total_iva, "
            + " COALESCE(v.vent_total, 0.0) AS vent_total, "
            + " COUNT(v.id_venta) AS num_productos "
            + " FROM "
            + " venta.\"Ventas\" v JOIN venta.\"DetalleVenta\" dv "
            + " ON dv.id_venta = v.id_venta "
            + " WHERE v.id_cliente = :idCliente "
            + " GROUP BY v.id_venta "
            + " ORDER BY vent_fecha_ingreso ",
            nativeQuery = true
    )
    public List<VentasRQ> getForPageCliente(@Param("idCliente") long idCliente);

}
