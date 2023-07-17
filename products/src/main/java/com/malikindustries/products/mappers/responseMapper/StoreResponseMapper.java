package com.malikindustries.products.mappers.responseMapper;

import com.malikindustries.products.bindings.AddressType;
import com.malikindustries.products.bindings.StoreDetailsType;
import com.malikindustries.products.bindings.StoreResponseType;
import com.malikindustries.products.model.StoreModel;

public class StoreResponseMapper {
    public static StoreResponseType mapStoreDetails(StoreModel storeModel){

        StoreResponseType storeResponseType = new StoreResponseType();
        if(storeModel.getStatusType().getStatusCd().equals("001")){
            StoreDetailsType storeDetailsType = new StoreDetailsType();
            AddressType addressType = new AddressType();
            storeDetailsType.setStoreId(storeModel.getStoreId());
            storeDetailsType.setPhoneNumber(storeModel.getPhoneNumber());
            storeDetailsType.setManagerName(storeModel.getManagerName());
            addressType.setZip(storeModel.getZipCd());
            addressType.setState(storeModel.getState());
            addressType.setAddressLine(storeModel.getAddressLine());
            addressType.setCity(storeModel.getCity());
            storeDetailsType.setAddressType(addressType);
            storeResponseType.setStoreDetailsType(storeDetailsType);
        }
        else{
            storeResponseType.setStatusType(storeModel.getStatusType());
        }


        return storeResponseType;
    }
}
