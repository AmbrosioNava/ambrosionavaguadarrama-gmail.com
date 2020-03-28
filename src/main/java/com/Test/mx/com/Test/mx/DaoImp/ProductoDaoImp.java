package com.Test.mx.com.Test.mx.DaoImp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Setter
@ToString
@Entity
@Table(name = "PRODUCTOS")
public class ProductoDaoImp implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column
    private String NOMBRE;

    @Column
    private int CANTIDAD;

    @Column
    private String CODIGO_INVENTARIO;

}
