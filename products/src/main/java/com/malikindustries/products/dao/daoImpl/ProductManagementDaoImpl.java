package com.malikindustries.products.dao.daoImpl;

import com.malikindustries.products.dao.ProductManagementDao;
import com.malikindustries.products.model.AddProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductManagementDaoImpl implements ProductManagementDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void insertProduct(AddProduct addProduct){

        Integer id = getId(addProduct);

        if(id==0) {
            jdbcTemplate.update("INSERT into ProductTable VALUES (?,?,?,?)",
                    addProduct.getProductId(), addProduct.getStoreId(),
                    addProduct.getProductCategory(), addProduct.getQuantity());
        }
        else{
            jdbcTemplate.update("UPDATE ProductTable SET QUANTITY = QUANTITY + ? WHERE ID=?",
                    addProduct.getQuantity(), id);

        }

    }

    private Integer getId(AddProduct addProduct){
        try {
            return jdbcTemplate.queryForObject("SELECT ID FROM ProductTable WHERE (STORE_ID=? AND PRODUCT_ID=?) ", Integer.class,
                    addProduct.getStoreId(), addProduct.getProductId());
        }
        catch(EmptyResultDataAccessException e){
            return 0;
        }
    }
}
