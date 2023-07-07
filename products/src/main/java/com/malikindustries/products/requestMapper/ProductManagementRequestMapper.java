package com.malikindustries.products.requestMapper;

import com.malikindustries.products.bindings.ProductManagementRequestType;
import com.malikindustries.products.model.ProductManagementModel;

public  class ProductManagementRequestMapper {

    public static ProductManagementModel mapRequest(ProductManagementRequestType productManagementRequestType, String action){

        ProductManagementModel productManagementModel = new ProductManagementModel();
        productManagementModel.setProductId(productManagementRequestType.getProductType().getProductId());
        productManagementModel.setProductCategory(productManagementRequestType.getProductType().getProductCategory());
        productManagementModel.setQuantity(productManagementRequestType.getProductType().getQuantity());
        productManagementModel.setStoreId(productManagementRequestType.getStoreId());
        productManagementModel.setAction(action);

        return productManagementModel;
    }
}
