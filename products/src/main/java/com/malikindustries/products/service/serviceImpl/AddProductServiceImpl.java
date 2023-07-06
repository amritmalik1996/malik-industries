package com.malikindustries.products.service.serviceImpl;

import com.malikindustries.products.model.AddProduct;
import com.malikindustries.products.service.AddProductService;
import org.springframework.stereotype.Service;

@Service
public class AddProductServiceImpl implements AddProductService {


    public Boolean addProduct(AddProduct addProduct){

        return true;
    }
}
