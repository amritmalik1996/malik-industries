package com.malikindustries.products.requestMapper;

import com.malikindustries.products.bindings.AddProductRequestType;
import com.malikindustries.products.model.AddProduct;

public  class AddProductRequestMapper {

    public static AddProduct mapRequest(AddProductRequestType addProductRequestType){

        AddProduct addProduct = new AddProduct();
        addProduct.setProductCategory(addProductRequestType.getProductType().getProductId());
        addProduct.setProductCategory(addProductRequestType.getProductType().getProductCategory());
        addProduct.setQuantity(addProductRequestType.getProductType().getQuantity());
        addProduct.setStoreId(addProductRequestType.getStoreId());

        return addProduct;
    }
}
