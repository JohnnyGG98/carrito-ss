package com.shopshopista.carritoss.repositoryes;

import com.shopshopista.carritoss.models.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gus
 */
@Repository
public interface DetalleVentaREPO extends JpaRepository<DetalleVenta, Long>{
    
}
