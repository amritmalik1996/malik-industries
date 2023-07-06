package com.malikindustries.products.bindings;

public class AddProductResponseType {
    String statusCd;
    String statusDesc;
    ErrorsType errorsType;

    public String getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public ErrorsType getErrorsType() {
        return errorsType;
    }

    public void setErrorsType(ErrorsType errorsType) {
        this.errorsType = errorsType;
    }
}
