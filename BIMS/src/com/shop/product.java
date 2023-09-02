package com.shop;

public class product {
	
	private int idproduct ;
	private String name ;
	private int quantity ;
	private String price ;
	private String description ;
	
	public product(int idproduct, String name, int quantity, String price, String description) {
		super();
		this.idproduct = idproduct;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.description = description;
	}

	public int getIdproduct() {
		return idproduct;
	}
	
	public void setIdproduct(int idproduct) {
		this.idproduct = idproduct;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
