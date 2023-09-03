package com.shop;

public class product {
	
	private int id ;
	private int quantity ;
	private int price ;
	
	public product(int id, int quantity, int price) {
		this.id = id;
		this.quantity = quantity;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getPrice() {
		return price;
	}
	
	
	

}
