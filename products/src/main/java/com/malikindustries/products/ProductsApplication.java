package com.malikindustries.products;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.malikindustries.products.bindings.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;


@SpringBootApplication
public class ProductsApplication {



	public static void main(String[] args) throws JsonProcessingException {
		//SpringApplication.run(ProductsApplication.class, args);

		ObjectMapper objectMapper = new ObjectMapper();
		RestTemplate restTemplate = new RestTemplate();


		ProductManagementRequestType productManagementRequestType = new ProductManagementRequestType();
		ProductType productType = new ProductType();
		productType.setProductCategory("Electronics");
		productType.setProductId(45128);
		productType.setQuantity(512);
		productManagementRequestType.setProductType(productType);
		productManagementRequestType.setStoreId(5641);
		//String json = objectMapper.writeValueAsString(productManagementRequestType);
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
		String json = objectMapper.writeValueAsString(addStoreRequestType);
		//System.out.println(json);
		List<Integer> l = Arrays.asList(32,58,39,78,36,89);

		Stream<Integer> stream = l.stream().filter(n -> {
			int val = n;
			while(val>10)n=n/10;
			if(n==3)return true;
			else return false;
		});
		//stream.forEach(n-> System.out.println());
		Predicate<AddressType> status  = addressType1 -> addressType1.getCity().length()>addressType1.getAddressLine().length();
		System.out.println(status.test(addressType));
		List<Integer> a = Arrays.asList(1,1,1);
		List<Integer> b = Arrays.asList(1,1,1);
		AddressType addressType1 = new AddressType();
		AddressType addressType2 = new AddressType();
		System.out.println(addressType1.equals(addressType2));
		System.out.println(a==b);
		System.out.println(a.equals(b));
		}





}
