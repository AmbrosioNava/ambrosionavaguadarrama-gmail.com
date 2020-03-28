package com.Test.mx.com.Test.mx.Dao;


import com.Test.mx.com.Test.mx.DaoImp.ProductoDaoImp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosDao extends JpaRepository<ProductoDaoImp,Long> {
    ProductoDaoImp findByID(long id);
}
