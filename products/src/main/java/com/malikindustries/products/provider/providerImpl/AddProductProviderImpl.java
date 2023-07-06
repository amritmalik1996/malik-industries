package com.malikindustries.products.provider.providerImpl;

import com.malikindustries.products.bindings.AddProductRequestType;
import com.malikindustries.products.bindings.AddProductResponseType;
import com.malikindustries.products.bindings.AddStoreRequestType;
import com.malikindustries.products.model.AddProduct;
import com.malikindustries.products.provider.AddProductProvider;
import com.malikindustries.products.requestMapper.AddProductRequestMapper;
import com.malikindustries.products.responseMapper.AddProductResponseMapper;
import com.malikindustries.products.service.AddProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddProductProviderImpl implements AddProductProvider {

    @Autowired
    AddProductService productService;

    @Override
    public AddProductResponseType addProduct(AddProductRequestType addProductRequestType){

        AddProduct addProduct = AddProductRequestMapper.mapRequest(addProductRequestType);
        Boolean status = productService.addProduct(addProduct);
        AddProductResponseType addProductResponseType = AddProductResponseMapper.mapResponse(status);
        return addProductResponseType;
    }

}
