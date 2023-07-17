package com.malikindustries.products.provider;

import com.malikindustries.products.bindings.*;
import org.springframework.stereotype.Component;

import java.util.List;


public interface StoreProvider {
    public StatusType addStore(AddStoreRequestType addStoreRequestType);
    public StoreResponseType getStore(Integer storeId);
    public List<ProductType> getStoreInventory(Integer storeId);
}
