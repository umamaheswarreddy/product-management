package com.cts.repository;




import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.entity.Product;

@Repository
public interface ProductManagementRepository extends CrudRepository<Product, Integer> {
//	@Query(value = "select * from Products p where p.name=:productName", nativeQuery = true)
//	Product findByProductName(String productName);

//	List<Product> findAllByVendorVendorId(Long id);

}