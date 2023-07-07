package com.malikindustries.products;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.malikindustries.products.bindings.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class ProductsApplication {



	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(ProductsApplication.class, args);

		ObjectMapper objectMapper = new ObjectMapper();

		ProductManagementRequestType productManagementRequestType = new ProductManagementRequestType();
		ProductType productType = new ProductType();
		productType.setProductCategory("Electronics");
		productType.setProductId(45128);
		productType.setQuantity(512);
		productManagementRequestType.setProductType(productType);
		productManagementRequestType.setStoreId(5641);
		String json = objectMapper.writeValueAsString(productManagementRequestType);
		StoreDetailsType storeDetailsType = new StoreDetailsType();
		storeDetailsType.setStoreId(5641);
		storeDetailsType.setManagerName("Ramesh");
		storeDetailsType.setPhoneNumber("9999042858");
		AddressType addressType = new AddressType();
		addressType.setAddressLine("350 Sanjay enclave opp GTK depot");
		addressType.setCity("New Delhi");
		addressType.setState("Delhi");
		addressType.setZip("110033");
		storeDetailsType.setAddressType(addressType);

		AddStoreRequestType addStoreRequestType = new AddStoreRequestType();
		addStoreRequestType.setStoreDetailsType(storeDetailsType);
		//String json = objectMapper.writeValueAsString(addStoreRequestType);
		//System.out.println(json);
	}
}
