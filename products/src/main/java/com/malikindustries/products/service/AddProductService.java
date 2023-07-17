package com.malikindustries.products.service;

import com.malikindustries.products.model.ProductManagementModel;
import com.malikindustries.products.bindings.StatusType;

public interface AddProductService {

    public StatusType maintainProduct(ProductManagementModel productManagementModel);
}
