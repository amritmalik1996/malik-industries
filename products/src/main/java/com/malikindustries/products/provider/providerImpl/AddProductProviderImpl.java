package com.malikindustries.products.provider.providerImpl;

import com.malikindustries.products.bindings.AddProductRequestType;
import com.malikindustries.products.bindings.AddProductResponseType;
import com.malikindustries.products.bindings.AddStoreRequestType;
import com.malikindustries.products.model.AddProduct;
import com.malikindustries.products.provider.AddProductProvider;
import com.malikindustries.products.requestMapper.AddProductRequestMapper;
import org.springframework.stereotype.Component;

@Component
public class AddProductProviderImpl implements AddProductProvider {

    @Override
    public AddProductResponseType addProduct(AddProductRequestType addProductRequestType){

        AddProduct addProduct = AddProductRequestMapper.mapRequest(addProductRequestType);

        return new AddProductResponseType();
    }

}
