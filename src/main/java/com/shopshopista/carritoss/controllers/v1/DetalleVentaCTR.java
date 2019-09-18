package com.shopshopista.carritoss.controllers.v1;

import com.shopshopista.carritoss.models.DetalleVenta;
import com.shopshopista.carritoss.repositoryes.DetalleVentaREPO;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gus
 */
@RestController
@RequestMapping("api/v1/venta/detalle")
public class DetalleVentaCTR {
    
    @Autowired
    private DetalleVentaREPO DVR;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public List<DetalleVenta> getAll(){
        return DVR.findAll();
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public DetalleVenta getOne(@PathVariable Long id){
        return DVR.getOne(id);
    }
    
    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public DetalleVenta save(@Valid @RequestBody DetalleVenta dv){
        return DVR.save(dv);
    }
    
}
