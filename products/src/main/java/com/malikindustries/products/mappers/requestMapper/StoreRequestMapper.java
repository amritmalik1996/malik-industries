package com.malikindustries.products.mappers.requestMapper;

import com.malikindustries.products.bindings.AddStoreRequestType;
import com.malikindustries.products.model.StoreModel;

public class StoreRequestMapper {
    public static StoreModel mapRequest(AddStoreRequestType addStoreRequestType){

        StoreModel storeModel = new StoreModel();
        storeModel.setStoreId(addStoreRequestType.getStoreDetailsType().getStoreId());
        storeModel.setManagerName(addStoreRequestType.getStoreDetailsType().getManagerName());
        storeModel.setPhoneNumber(addStoreRequestType.getStoreDetailsType().getPhoneNumber());
        storeModel.setCity(addStoreRequestType.getStoreDetailsType().getAddressType().getCity());
        storeModel.setState(addStoreRequestType.getStoreDetailsType().getAddressType().getState());
        storeModel.setAddressLine(addStoreRequestType.getStoreDetailsType().getAddressType().getAddressLine());
        storeModel.setZipCd(addStoreRequestType.getStoreDetailsType().getAddressType().getZip());

        return storeModel;
    }
}
