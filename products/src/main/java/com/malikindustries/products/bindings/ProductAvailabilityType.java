package com.malikindustries.products.bindings;

public class ProductAvailabilityType {
    Integer quantity;
    StoreDetailsType storeDetailsType;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public StoreDetailsType getStoreDetailsType() {
        return storeDetailsType;
    }

    public void setStoreDetailsType(StoreDetailsType storeDetailsType) {
        this.storeDetailsType = storeDetailsType;
    }
}
