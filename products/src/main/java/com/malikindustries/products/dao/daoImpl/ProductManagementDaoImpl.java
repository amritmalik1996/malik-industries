package com.malikindustries.products.dao.daoImpl;

import com.malikindustries.products.dao.ProductManagementDao;
import com.malikindustries.products.model.ProductManagementModel;
import com.malikindustries.products.bindings.StatusType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductManagementDaoImpl implements ProductManagementDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public StatusType insertProduct(ProductManagementModel productManagementModel){

        StatusType statusType = new StatusType();
        Integer id = getId(productManagementModel);

        if(id==0) {
            jdbcTemplate.update("INSERT into ProductTable VALUES (?,?,?,?)",
                    productManagementModel.getProductId(), productManagementModel.getStoreId(),
                    productManagementModel.getProductCategory(), productManagementModel.getQuantity());
        }
        else{
            jdbcTemplate.update("UPDATE ProductTable SET QUANTITY = QUANTITY + ? WHERE ID=?",
                    productManagementModel.getQuantity(), id);

        }
        statusType.setStatusCd("001");
        statusType.setStatusDesc("Product Added Successfully");
        return statusType;
    }

    @Override
    public StatusType deductProduct(ProductManagementModel productManagementModel) {

        StatusType statusType = new StatusType();
        Integer id = getId(productManagementModel);

        if(id==0){
            statusType.setStatusDesc("This product is not available in this store");
            statusType.setStatusCd("E-005");
            return statusType;
        }

        Integer availableQuantity = jdbcTemplate.queryForObject("SELECT QUANTITY from ProductTable WHERE ID=?",
                Integer.class,id);
        Integer remainingAfterDeductionQuantity = Integer.valueOf(availableQuantity)-Integer.valueOf(productManagementModel.getQuantity());

       if(availableQuantity<productManagementModel.getQuantity()){
            statusType.setStatusDesc("Only "+availableQuantity+" units available in given store");
            statusType.setStatusCd("E-005");
            return statusType;
        }


        jdbcTemplate.update("UPDATE ProductTable SET QUANTITY = QUANTITY - ? WHERE ID=?",
                productManagementModel.getQuantity(), id);
        statusType.setStatusDesc("Product deducted successfully. "+remainingAfterDeductionQuantity+" items remaining");
        statusType.setStatusCd("002");
        return statusType;
    }

    @Override
    public StatusType deleteProduct(ProductManagementModel productManagementModel) {
        StatusType statusType = new StatusType();
        Integer id = getId(productManagementModel);

        if(id==0){
            statusType.setStatusDesc("This product is not available in this store");
            statusType.setStatusCd("E-005");
            return statusType;
        }
        jdbcTemplate.update("DELETE FROM ProductTable WHERE ID = ?",id);
        statusType.setStatusDesc("Product deducted successfully.");
        statusType.setStatusCd("003");
        return statusType;
    }

    private Integer getId(ProductManagementModel productManagementModel){
        try {
            return jdbcTemplate.queryForObject("SELECT ID FROM ProductTable WHERE (STORE_ID=? AND PRODUCT_ID=?) ", Integer.class,
                    productManagementModel.getStoreId(), productManagementModel.getProductId());
        }
        catch(EmptyResultDataAccessException e){
            return 0;
        }
    }
}
