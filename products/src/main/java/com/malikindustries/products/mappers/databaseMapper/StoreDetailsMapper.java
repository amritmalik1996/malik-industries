package com.malikindustries.products.mappers.databaseMapper;

import com.malikindustries.products.model.StoreModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StoreDetailsMapper implements RowMapper<StoreModel> {
    @Override
    public StoreModel mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        StoreModel storeModel = new StoreModel();
        storeModel.setStoreId(resultSet.getInt("STORE_ID"));
        storeModel.setAddressLine(resultSet.getString("ADDRESS_LINE"));
        storeModel.setPhoneNumber(resultSet.getString("PHONE_NUMBER"));
        storeModel.setState(resultSet.getString("STATE"));
        storeModel.setCity(resultSet.getString("CITY"));
        storeModel.setZipCd(resultSet.getString("ZIP"));
        storeModel.setManagerName(resultSet.getString("MANAGER_NAME"));

        return storeModel;
    }
}
