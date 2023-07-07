package com.malikindustries.products.provider.providerImpl;

import com.malikindustries.products.bindings.ProductManagementRequestType;
import com.malikindustries.products.bindings.ProductManagementResponseType;
import com.malikindustries.products.model.ProductManagementModel;
import com.malikindustries.products.model.StatusType;
import com.malikindustries.products.provider.ProductManagementProvider;
import com.malikindustries.products.requestMapper.ProductManagementRequestMapper;
import com.malikindustries.products.responseMapper.ProductManagementResponseMapper;
import com.malikindustries.products.service.AddProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductManagementProviderImpl implements ProductManagementProvider {

    @Autowired
    AddProductService productService;

    @Override
    public ProductManagementResponseType maintainProduct(ProductManagementRequestType productManagementRequestType, String action){

        ProductManagementModel productManagementModel = ProductManagementRequestMapper.mapRequest(productManagementRequestType,action);

        StatusType status = productService.maintainProduct(productManagementModel);


        ProductManagementResponseType productManagementResponseType = ProductManagementResponseMapper.mapMaintainResponse(status);
        return productManagementResponseType;
    }

}
