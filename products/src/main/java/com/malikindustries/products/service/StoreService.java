package com.malikindustries.products.service;

import com.malikindustries.products.bindings.StatusType;
import com.malikindustries.products.bindings.StoreDetailsType;
import com.malikindustries.products.model.StoreModel;

public interface StoreService {
    public StatusType addStore(StoreModel storeModel);
    public StoreModel getStore(Integer id);

}
