package com.shopshopista.carritoss.controllers.v1;

import com.shopshopista.carritoss.models.DetalleVenta;
import com.shopshopista.carritoss.models.Venta;
import com.shopshopista.carritoss.pojos.RQ.VentasRQ;
import com.shopshopista.carritoss.pojos.VentaPOST;
import com.shopshopista.carritoss.repositoryes.VentaREPO;
import java.util.ArrayList;
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
@CrossOrigin
public class VentaCTR {

    @Autowired
    private VentaREPO VR;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public List<Venta> getAll() {
        return VR.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Venta getOne(@PathVariable Long id) {
        return VR.getOne(id);
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    @ResponseBody
    public Venta save(@Valid @RequestBody VentaPOST v) {

        Venta ve = new Venta();
        List<DetalleVenta> dves = new ArrayList<>();

        v.getDetalle().forEach(dv -> {
            DetalleVenta dve = new DetalleVenta();
            dve.setVenta(ve);
            dve.setId_producto(dv.getId_producto());
            dve.setDeve_num_producto(dv.getDeve_num_producto());
            dves.add(dve);
        });

        ve.setId_cliente(v.getId_cliente());
        ve.setDetalle_venta(dves);

        return VR.save(ve);
    }
/*
    @RequestMapping(value = "/page/{idCliente}", method = RequestMethod.GET)
    @ResponseBody
    public List<VentasRQ> getForCliente(@PathVariable long idCliente) {
        return VR.getForPageCliente(idCliente);
    }*/

}
