package com.malikindustries.products.provider.providerImpl;

import com.malikindustries.products.bindings.*;
import com.malikindustries.products.mappers.responseMapper.StoreResponseMapper;
import com.malikindustries.products.model.StoreModel;
import com.malikindustries.products.provider.StoreProvider;
import com.malikindustries.products.mappers.requestMapper.StoreRequestMapper;
import com.malikindustries.products.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StoreProviderImpl implements StoreProvider {
    @Autowired
    StoreService storeService;
    @Override
    public StatusType addStore(AddStoreRequestType addStoreRequestType) {
        StoreModel storeModel = StoreRequestMapper.mapRequest(addStoreRequestType);
        return storeService.addStore(storeModel);
    }

    @Override
    public StoreResponseType getStore(Integer storeId) {
        StoreModel storeModel = storeService.getStore(storeId);
        StoreResponseType storeResponseType = StoreResponseMapper.mapStoreDetails(storeModel);
        return storeResponseType;
    }

    @Override
    public List<ProductType> getStoreInventory(Integer storeId) {
        return null;
    }
}
