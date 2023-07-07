package com.malikindustries.products.dao;

import com.malikindustries.products.model.ProductManagementModel;
import com.malikindustries.products.model.StatusType;

public interface ProductManagementDao {

    public StatusType insertProduct(ProductManagementModel productManagementModel);
    public StatusType deductProduct(ProductManagementModel productManagementModel);
    public StatusType deleteProduct(ProductManagementModel productManagementModel);
}
