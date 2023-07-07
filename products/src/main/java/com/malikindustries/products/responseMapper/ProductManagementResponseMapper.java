package com.malikindustries.products.responseMapper;

import com.malikindustries.products.bindings.ProductManagementResponseType;
import com.malikindustries.products.model.ErrorsType;
import com.malikindustries.products.model.StatusType;

public class ProductManagementResponseMapper {

    public static ProductManagementResponseType mapMaintainResponse(StatusType status){
        ProductManagementResponseType productManagementResponseType = new ProductManagementResponseType();


        if(status.getStatusCd().startsWith("E")){
            ErrorsType errorsType = new ErrorsType();
            errorsType.setErrorCd("E-001");
            errorsType.setErrorDesc(status.getStatusDesc());
            productManagementResponseType.setErrorsType(errorsType);
        }
        else {
            productManagementResponseType.setStatusCd(status.getStatusCd());
            productManagementResponseType.setStatusDesc(status.getStatusDesc());
        }

        return productManagementResponseType;
    }
}
