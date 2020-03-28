package com.Test.mx.com.Test.mx.Dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import sun.rmi.runtime.Log;

@Getter
@Setter
@ToString
@Builder
public class ProductoDto {
    private int ID;
    private String NOMBRE;
    private int CANTIDAD;
    private String CODIGO_INVENTARIO;
}
