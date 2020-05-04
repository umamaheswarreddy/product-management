package com.cts.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.entity.Product;
import com.cts.repository.ProductManagementRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductManagementRepository repo;

	public List<Product> getProducts() {
		return (List<Product>) repo.findAll();
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
	
//	public Product searchByName(String productName) {
//		return (Product) repo.findByProductName(productName);
//	}

//	public List<Product> getProductByVendorId(Long vendorId) {
//		return repo.findAllByVendorVendorId(vendorId);
//		
//	}

}