package com.cts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;


@Entity(name="products")
@Data
public class Product {
	
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="id")
	@NotNull
	private int productId;
	
	@NotNull
	@Size(min = 3,message = "productName should contain atleast 3 chars")
	@Column(name="name")
	private String productName;
	
	@NotNull
	@Size(min = 3,message = "productDescription should contain atleast 3 chars")
	@Column(name="description")
	private String productDescription;
	
	@Column
	private float price;
	
//	@ManyToOne(cascade = CascadeType.ALL)
	private int  vid;
	
	@Transient
	private Vendor vendor;

//	public Product(int productId, String productName, String productDescription, float price, int vid, Vendor vendor) {
//		super();
//		this.productId = productId;
//		this.productName = productName;
//		this.productDescription = productDescription;
//		this.price = price;
//		this.vid = vid;
//		this.vendor = vendor;
//	}
//
//	public int getProductId() {
//		return productId;
//	}
//
//	public void setProductId(int productId) {
//		this.productId = productId;
//	}
//
//	public String getProductName() {
//		return productName;
//	}
//
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
//
//	public String getProductDescription() {
//		return productDescription;
//	}
//
//	public void setProductDescription(String productDescription) {
//		this.productDescription = productDescription;
//	}
//
//	public float getPrice() {
//		return price;
//	}
//
//	public void setPrice(float price) {
//		this.price = price;
//	}
//
//	public int getVid() {
//		return vid;
//	}
//
//	public void setVid(int vid) {
//		this.vid = vid;
//	}
//
//	public Vendor getVendor() {
//		return vendor;
//	}
//
//	public void setVendor(Vendor vendor) {
//		this.vendor = vendor;
//	}
//	
//
//	
//	

	
	
}