package com.Test.mx.com.Test.mx.Controller;

import com.Test.mx.com.Test.mx.DaoImp.ProductoDaoImp;
import com.Test.mx.com.Test.mx.Dto.ProductoDto;
import com.Test.mx.com.Test.mx.Service.IProductoService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductosController {

    @Autowired
    IProductoService productoService;

    @RequestMapping(value = "productos", method = RequestMethod.GET, produces = { "application/json", "application/xml" })
    private String producto(){
        String response = "";
        try{
            List<ProductoDto> prod = productoService.mostrar();
            response = new Gson().toJson(prod);
        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
        return response;
    }

    @RequestMapping(value = "findByIdProd/{id}", method = RequestMethod.POST, produces = { "application/json", "application/xml" })
    private String findById(@PathVariable("id") Long id){
        String response = "";
        try{
            ProductoDto productoDto =productoService.findById(id);
            response = new Gson().toJson(productoDto);
        }catch (Exception ex){
            System.out.println("Error: "+ex);
        }
        return response;
    }

}
