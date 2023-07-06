package com.malikindustries.products;

import com.malikindustries.products.bindings.AddProductRequestType;
import com.malikindustries.products.bindings.AddProductResponseType;
import com.malikindustries.products.provider.AddProductProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    AddProductProvider addProductProvider;
    @PostMapping(value = "/addproduct")
    public ResponseEntity<AddProductResponseType> addProduct(@RequestBody AddProductRequestType addProductRequestType){

        AddProductResponseType addProductResponseType = addProductProvider.addProduct(addProductRequestType);

        return new ResponseEntity<AddProductResponseType>(addProductResponseType,HttpStatus.OK);
    }
    @GetMapping("/get")
    public ResponseEntity<AddProductResponseType> getProduct(){
        return new ResponseEntity<AddProductResponseType>(new AddProductResponseType(),HttpStatus.OK);
    }
}

