package com.malikindustries.products.responseMapper;

import com.malikindustries.products.bindings.AddProductResponseType;
import com.malikindustries.products.bindings.ErrorsType;

public class AddProductResponseMapper {

    public static AddProductResponseType mapResponse(Boolean status){
        AddProductResponseType addProductResponseType = new AddProductResponseType();
        if(status){

            addProductResponseType.setStatusCd("001");
            addProductResponseType.setStatusDesc("Product Added Successfully");
        }
        else{
            ErrorsType errorsType = new ErrorsType();
            errorsType.setErrorCd("E-001");
            errorsType.setErrorDesc("Some problem Occurred");
            addProductResponseType.setErrorsType(errorsType);
        }

        return addProductResponseType;
    }
}
