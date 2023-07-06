package com.malikindustries.products;

import com.malikindustries.products.bindings.AddProductResponseType;
import com.malikindustries.products.bindings.ErrorsType;
import org.springframework.stereotype.Component;

@Component
public class Mock {

    public AddProductResponseType addProduct(){
        AddProductResponseType addProductResponseType = new AddProductResponseType();
        addProductResponseType.setStatusCd("001");
        addProductResponseType.setStatusDesc("Product Added Successfully");

        ErrorsType  errorsType = new ErrorsType();
        errorsType.setErrorCd("");
        errorsType.setErrorDesc("");
        addProductResponseType.setErrorsType(errorsType);
        return addProductResponseType;
    }
}
