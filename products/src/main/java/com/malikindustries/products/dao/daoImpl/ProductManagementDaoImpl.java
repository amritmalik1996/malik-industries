package com.malikindustries.products.dao.daoImpl;

import com.malikindustries.products.dao.ProductManagementDao;
import com.malikindustries.products.model.AddProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductManagementDaoImpl implements ProductManagementDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void insertProduct(AddProduct addProduct){

        jdbcTemplate.update("INSERT into ProductTable VALUES (?,?,?,?)",
                addProduct.getProductId(),addProduct.getStoreId(),
                addProduct.getProductCategory(),addProduct.getQuantity());

    }
}
