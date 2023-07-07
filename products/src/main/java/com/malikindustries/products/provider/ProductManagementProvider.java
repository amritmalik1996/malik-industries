package com.malikindustries.products.provider;

import com.malikindustries.products.bindings.ProductManagementRequestType;
import com.malikindustries.products.bindings.ProductManagementResponseType;

public interface ProductManagementProvider {
    public ProductManagementResponseType maintainProduct(ProductManagementRequestType productManagementRequestType, String action);
}
