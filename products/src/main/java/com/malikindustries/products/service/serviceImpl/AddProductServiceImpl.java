package com.malikindustries.products.service.serviceImpl;

import com.malikindustries.products.dao.daoImpl.ProductManagementDaoImpl;
import com.malikindustries.products.model.ProductManagementModel;
import com.malikindustries.products.model.StatusType;
import com.malikindustries.products.service.AddProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddProductServiceImpl implements AddProductService {
    @Autowired
    ProductManagementDaoImpl productManagementDao;

    @Override
    public StatusType maintainProduct(ProductManagementModel productManagementModel){
        switch(productManagementModel.getAction()) {
            case "add": return productManagementDao.insertProduct(productManagementModel);
            case "deduct": return productManagementDao.deductProduct(productManagementModel);
        }
        StatusType statusType = new StatusType();
        statusType.setStatusDesc("Some problem occurred please contact customer support");
        statusType.setStatusCd("E-003");
        return statusType;
    }
}
