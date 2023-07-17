package com.malikindustries.products;

import com.malikindustries.products.bindings.*;
import com.malikindustries.products.provider.ProductManagementProvider;
import com.malikindustries.products.provider.StoreProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    ProductManagementProvider productManagementProvider;
    @Autowired
    StoreProvider storeProvider;
    @PostMapping(value = "/product/{action}")
    public ResponseEntity<ProductManagementResponseType> addProduct(@RequestBody ProductManagementRequestType productManagementRequestType, @PathVariable String action){

        ProductManagementResponseType productManagementResponseType = productManagementProvider.maintainProduct(productManagementRequestType, action);

        return new ResponseEntity<ProductManagementResponseType>(productManagementResponseType,HttpStatus.OK);
    }
    @GetMapping("/get")
    public ResponseEntity<ProductManagementResponseType> getProduct(){
        return new ResponseEntity<ProductManagementResponseType>(new ProductManagementResponseType(),HttpStatus.OK);
    }

    @PostMapping(value = "/add-store")
    public ResponseEntity<StatusType> addStore(@RequestBody AddStoreRequestType addStoreRequestType){
        StatusType statusType = storeProvider.addStore(addStoreRequestType);
        return new ResponseEntity<StatusType>(statusType,HttpStatus.OK);
    }

    @GetMapping("/get-store/{storeId}")
    public ResponseEntity<StoreResponseType> getStore(@PathVariable Integer storeId){
        StoreResponseType storeResponseType = storeProvider.getStore(storeId);
        return new ResponseEntity<StoreResponseType>(storeResponseType,HttpStatus.OK);
    }

    @GetMapping("/store-inventory")
    public ResponseEntity<StoreResponseType> getStoreInventory(@PathVariable Integer storeId){
        StoreResponseType storeResponseType = storeProvider.getStore(storeId);
        return new ResponseEntity<StoreResponseType>(storeResponseType,HttpStatus.OK);
    }

}

