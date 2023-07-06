package com.malikindustries.products.service.serviceImpl;

import com.malikindustries.products.dao.daoImpl.ProductManagementDaoImpl;
import com.malikindustries.products.model.AddProduct;
import com.malikindustries.products.service.AddProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class AddProductServiceImpl implements AddProductService {
    @Autowired
    ProductManagementDaoImpl productManagementDao;

    public Boolean addProduct(AddProduct addProduct){
        productManagementDao.insertProduct(addProduct);
        return true;
    }
}
