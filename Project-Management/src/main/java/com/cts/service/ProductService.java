package com.cts.service;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.entity.Product;
import com.cts.entity.Vendor;
import com.cts.repository.ProductManagementRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductManagementRepository repo;
	
	@Autowired
	private VendorServiceProxy proxy;

	public List<Product> getProducts() {
		
		List<Product> products= (List<Product>) repo.findAll();
		for(Product p:products) {
			p.setVendor(proxy.getVendorById(p.getVid()));
		}
		return products;
		
	}
	
	public Vendor getVendorById(int vendorId) {
		
		return proxy.getVendorById(vendorId);
	}

	public Optional<Product> getProductById(int productId) {
//		return repo.findById(productId).orElseThrow(()->new RuntimeException("Item not found"));
		return repo.findById(productId);
	}

	public void addProduct(Product product) {
		repo.save(product);
	}

	public void deleteProduct(Integer productId) {
		repo.deleteById(productId);
		
	}

	public void updateProduct(Product product) {
		repo.save(product);
	}

	public Collection<Vendor> getAll() {
		// TODO Auto-generated method stub
		return proxy.getAll();
	}

	
	
//	public Product searchByName(String productName) {
//		return (Product) repo.findByProductName(productName);
//	}

//	public List<Product> getProductByVendorId(Long vendorId) {
//		return repo.findAllByVendorVendorId(vendorId);
//		
//	}

}