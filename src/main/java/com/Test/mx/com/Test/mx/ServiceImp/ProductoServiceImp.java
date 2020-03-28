package com.Test.mx.com.Test.mx.ServiceImp;

import com.Test.mx.com.Test.mx.Dao.ProductosDao;
import com.Test.mx.com.Test.mx.DaoImp.ProductoDaoImp;
import com.Test.mx.com.Test.mx.Dto.ProductoDto;
import com.Test.mx.com.Test.mx.Service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoServiceImp implements IProductoService {

    @Autowired
    ProductosDao productosDao;

    public List<ProductoDto> mostrar() {
        List<ProductoDaoImp> listProduct = productosDao.findAll();

        List<ProductoDto> listProductoDto = new ArrayList<>();

        listProduct.stream().forEach(datos->{
            ProductoDto productoDto = ProductoDto.builder()
                    .ID(datos.getID().intValue())
                    .NOMBRE(datos.getNOMBRE())
                    .CANTIDAD(datos.getCANTIDAD())
                    .CODIGO_INVENTARIO(datos.getCODIGO_INVENTARIO())
                    .build();

            listProductoDto.add(productoDto);
        });

        return listProductoDto;
    }

    @Override
    public ProductoDto findById(long id) {
        ProductoDaoImp lisProductById = productosDao.findByID(id);
        return ProductoDto.builder()
                .ID(lisProductById.getID().intValue())
                .NOMBRE(lisProductById.getNOMBRE())
                .CANTIDAD(lisProductById.getCANTIDAD())
                .CODIGO_INVENTARIO(lisProductById.getCODIGO_INVENTARIO())
                .build();
    }

}
