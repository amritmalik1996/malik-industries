package com.malikindustries.products.provider;

import com.malikindustries.products.bindings.AddProductResponseType;
import com.malikindustries.products.bindings.AddStoreRequestType;

public interface AddProductProvider {
    public AddProductResponseType addProduct(AddStoreRequestType addStoreRequestType);
}
