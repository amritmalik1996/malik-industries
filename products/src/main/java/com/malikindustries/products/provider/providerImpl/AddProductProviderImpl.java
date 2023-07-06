package com.malikindustries.products.provider.providerImpl;

import com.malikindustries.products.bindings.AddProductResponseType;
import com.malikindustries.products.bindings.AddStoreRequestType;
import com.malikindustries.products.provider.AddProductProvider;
import org.springframework.stereotype.Component;

@Component
public class AddProductProviderImpl implements AddProductProvider {

    public AddProductResponseType addProduct(AddStoreRequestType addStoreRequestType){
        return new AddProductResponseType();
    }
}
