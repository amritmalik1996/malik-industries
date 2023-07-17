package com.malikindustries.products.bindings;

public class StoreResponseType {
    StatusType statusType;
    StoreDetailsType storeDetailsType;

    public StatusType getStatusType() {
        return statusType;
    }

    public void setStatusType(StatusType statusType) {
        this.statusType = statusType;
    }

    public StoreDetailsType getStoreDetailsType() {
        return storeDetailsType;
    }

    public void setStoreDetailsType(StoreDetailsType storeDetailsType) {
        this.storeDetailsType = storeDetailsType;
    }
}
