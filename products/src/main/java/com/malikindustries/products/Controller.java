package com.malikindustries.products;

import com.malikindustries.products.bindings.ProductManagementRequestType;
import com.malikindustries.products.bindings.ProductManagementResponseType;
import com.malikindustries.products.provider.ProductManagementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    ProductManagementProvider productManagementProvider;
    @PostMapping(value = "/product/{action}")
    public ResponseEntity<ProductManagementResponseType> addProduct(@RequestBody ProductManagementRequestType productManagementRequestType, @PathVariable String action){

        ProductManagementResponseType productManagementResponseType = productManagementProvider.maintainProduct(productManagementRequestType, action);

        return new ResponseEntity<ProductManagementResponseType>(productManagementResponseType,HttpStatus.OK);
    }
    @GetMapping("/get")
    public ResponseEntity<ProductManagementResponseType> getProduct(){
        return new ResponseEntity<ProductManagementResponseType>(new ProductManagementResponseType(),HttpStatus.OK);
    }
}

