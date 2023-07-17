package com.malikindustries.products.dao;

import com.malikindustries.products.bindings.StatusType;
import com.malikindustries.products.bindings.StoreDetailsType;
import com.malikindustries.products.model.StoreModel;

public interface StoreDao {
    public StatusType addStore(StoreModel storeModel);
    public StoreModel getStore(Integer id);
}
