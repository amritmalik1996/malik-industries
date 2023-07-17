package com.malikindustries.products.service.serviceImpl;

import com.malikindustries.products.bindings.StatusType;
import com.malikindustries.products.dao.StoreDao;
import com.malikindustries.products.model.StoreModel;
import com.malikindustries.products.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService {
    @Autowired
    StoreDao storeDao;
    @Override
    public StatusType addStore(StoreModel storeModel) {
        StatusType statusType = storeDao.addStore(storeModel);
        return statusType;
    }

    @Override
    public StoreModel getStore(Integer id) {
        return storeDao.getStore(id);
    }
}
