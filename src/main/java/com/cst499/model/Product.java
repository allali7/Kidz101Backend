package com.cst499.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

// map the model to the database
@Entity
@Table(name = "products")

public class Product {
	
	// define primary key for table 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productId;
//	
	//
		//
			//
	//the commented out section is what I tried easlier but gave errors 
	
//	
	@ManyToOne
	@JoinColumn(name="sellerId")
	private Seller seller;
//	@ManyToOne
//	private Seller seller;
//	
	
	
	public Product(long productId, Seller seller, String pName, String department, String imageUrl, int price, int quantity) {
		super();
		this.productId = productId;
		this.seller = seller;
		this.pName = pName;
		this.department = department;
		this.imageUrl = imageUrl;
		this.price = price;
		this.quantity = quantity;
	}

	// column names for field in the database table
	@Column(name = "p_name")
	private String pName;
	
	@Column(name = "department")
	private String department;
	
	@Column(name = "image_url")
	private String imageUrl;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "quantity")
	private int quantity;
	
	
	// default constructor needed bc of hibernate creating prxys 
	public Product(){
		
	}
	
	

//	public Product(long productId, String pName, String department, String imageUrl, int price, int quantity) {
//		super();
//		this.productId = productId;
//		this.pName = pName;
//		this.department = department;
//		this.imageUrl = imageUrl;
//		this.price = price;
//		this.quantity = quantity;
//	}
	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public long  getId() {
		return productId;
	}
	public void setId(long productId) {
		this.productId = productId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	} 

}