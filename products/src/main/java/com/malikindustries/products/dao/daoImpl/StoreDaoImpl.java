package com.malikindustries.products.dao.daoImpl;

import com.malikindustries.products.bindings.StatusType;
import com.malikindustries.products.bindings.StoreDetailsType;
import com.malikindustries.products.dao.StoreDao;
import com.malikindustries.products.mappers.databaseMapper.StoreDetailsMapper;
import com.malikindustries.products.model.StoreModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StoreDaoImpl implements StoreDao {
    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public StatusType addStore(StoreModel storeModel) {
        StatusType statusType = new StatusType();
        try
        {jdbcTemplate.update("INSERT into StoreDetails VALUES (?,?,?,?,?,?,?)",
                storeModel.getStoreId(),storeModel.getPhoneNumber(),storeModel.getManagerName(),
                storeModel.getAddressLine(),storeModel.getState(),storeModel.getCity(),storeModel.getZipCd());
        statusType.setStatusCd("001");
        statusType.setStatusDesc("Store added successfully");}
        catch (Exception e){
            statusType.setStatusCd("003");
            statusType.setStatusDesc("Store already exists with given store id");
        }
        return statusType;
    }

    @Override
    public StoreModel getStore(Integer id) {
        StoreModel storeModel = new StoreModel();
        StatusType statusType = new StatusType();
        try{
            storeModel = jdbcTemplate.queryForObject("SELECT * FROM StoreDetails WHERE STORE_ID = ?", new
                StoreDetailsMapper(),id);
            statusType.setStatusDesc("Please find the store details below");
            statusType.setStatusCd("001");
            storeModel.setStatusType(statusType);
        }
        catch(Exception e){

            statusType.setStatusDesc("No store available with this store Id");
            statusType.setStatusCd("003");
            storeModel.setStatusType(statusType);
        }
        return storeModel;
    }
}
