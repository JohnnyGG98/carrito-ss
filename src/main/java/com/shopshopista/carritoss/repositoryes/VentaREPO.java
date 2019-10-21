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
            + " v.vent_subtotal_iva AS vent_subtotal_iva, "
            + " v.vent_subtotal_sin_iva AS vent_subtotal_sin_iva, "
            + " v.vent_total_iva AS vent_total_iva, "
            + " v.vent_total AS vent_total, "
            + " COUNT(v.id_venta) AS num_productos "
            + " FROM "
            + " venta.\"Ventas\" v JOIN venta.\"DetalleVenta\" dv "
            + " ON dv.id_venta = v.id_venta "
            + " WHERE v.id_cliente = :idCliente "
            + " GROUP BY v.id_venta ",
            nativeQuery = true
    )
    public List<VentasRQ> getForPageCliente(@Param("idCliente") long idCliente);

}
