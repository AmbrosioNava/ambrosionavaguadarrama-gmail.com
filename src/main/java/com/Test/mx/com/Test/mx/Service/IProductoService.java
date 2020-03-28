package com.Test.mx.com.Test.mx.Service;

import com.Test.mx.com.Test.mx.Dto.ProductoDto;

import java.util.List;

public interface IProductoService {
    List<ProductoDto> mostrar();
    ProductoDto findById(long id);
}
