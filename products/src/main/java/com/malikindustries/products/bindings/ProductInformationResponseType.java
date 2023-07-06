package com.malikindustries.products.bindings;

public class ProductInformationResponseType {
    ProductType productType;
    ProductAvailabilityType productAvailabilityType;
    ErrorsType errorsType;

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public ProductAvailabilityType getProductAvailabilityType() {
        return productAvailabilityType;
    }

    public void setProductAvailabilityType(ProductAvailabilityType productAvailibilityType) {
        this.productAvailabilityType = productAvailibilityType;
    }

    public ErrorsType getErrorsType() {
        return errorsType;
    }

    public void setErrorsType(ErrorsType errorsType) {
        this.errorsType = errorsType;
    }
}
