package com.shopshopista.carritoss.controllers.v1;

import com.shopshopista.carritoss.models.Venta;
import com.shopshopista.carritoss.repositoryes.VentaREPO;
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
@RequestMapping("/api/v1/venta")
public class VentaCTR {
    
    @Autowired
    private VentaREPO VR;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public List<Venta> getAll(){
        return VR.findAll();
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public Venta getOne(@PathVariable Long id){
        return VR.getOne(id);
    }
    
    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public Venta save(@Valid @RequestBody Venta v){
        return VR.save(v);
    }
}
