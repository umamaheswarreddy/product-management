package com.cts.controller;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entity.Product;
import com.cts.entity.Vendor;
import com.cts.exception.GlobelException;
import com.cts.service.ProductService;
import com.cts.service.VendorServiceProxy;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService service;
	
	

	@GetMapping("/all")
	List<Product> getAll() {
		
		return service.getProducts();
	}

	@GetMapping("/{productId}")
	Optional<Product> getById(@PathVariable int productId) {
		return service.getProductById(productId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/add")
	void addProduct(@Valid @RequestBody Product product) throws GlobelException {
		service.addProduct(product);
	}

	@RequestMapping(method = RequestMethod.PUT)
	void updateProduct(@RequestBody Product product) {
		service.updateProduct(product);
	}
	
	 @RequestMapping("/dashboard/feign/vendors")
	 @HystrixCommand(fallbackMethod = "tolerence")
	   public  Collection<Vendor> findPeers(){
	        return service.getAll();
	   }
	 
	 public  Collection<Vendor> tolerence(){
		 System.out.println("server down");
	        return Arrays.asList(new Vendor(500, "df", "dsf", "7416565985", "maheshuma@gmail.com"),
	        		new Vendor(501, "df", "dsf", "7416565985", "maheshuma@gmail.com")
	        		            );
	   }
	
	
//	 @RequestMapping(method = RequestMethod.GET,value="/dashboard/feign/{vendorId}")
//	   public Vendor findme(@PathVariable Long vendorId){
//	      return service.getVendorById(vendorId);
//	   }
	 
	 
	      

//	@GetMapping("/{productName}")
//	Product searchByName(@PathVariable String productName){
//		return service.searchByName(productName);
//	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{productId}")
	void deleteProductById(@PathVariable int productId) {
		service.deleteProduct(productId);
	}
	
//	@GetMapping(value="/vendor/{vendorId}")
//	List<Product> getProductsByVendorId(@PathVariable Long vendorId){
//		return service.getProductByVendorId(vendorId);
//	}
	@GetMapping("/default")
	@HystrixCommand(fallbackMethod="getAll")
	public List<Product> retrieveConfiguration() {
		throw new RuntimeException("Not available");
	}
	
	
	

}