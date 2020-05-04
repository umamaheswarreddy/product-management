package com.cts.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity(name="products")
public class Product {
	
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="id")
	private int productId;
	
	@Column(name="name")
	private String productName;
	
	@Column(name="description")
	private String productDescription;
	
	@Column
	private float price;
	
//	@ManyToOne(cascade = CascadeType.ALL)
	private int  vid;
	

	public Product() {
		super();
	}

	

	public Product(int productId, String productName, String productDescription, float price, int vid) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.price = price;
		this.vid = vid;
	}



	public int getVid() {
		return vid;
	}



	public void setVid(int vid) {
		this.vid = vid;
	}



	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	

	
	
}