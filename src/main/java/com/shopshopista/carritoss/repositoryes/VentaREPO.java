package com.shopshopista.carritoss.repositoryes;

import com.shopshopista.carritoss.models.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gus
 */
@Repository
public interface VentaREPO extends JpaRepository<Venta, Long>{
    
}
