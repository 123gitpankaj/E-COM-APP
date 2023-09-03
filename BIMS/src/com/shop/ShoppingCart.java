package com.shop;

import java.awt.ItemSelectable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {
	
	
	List<product> items = new ArrayList<product>();

	
	public void fillCarts() {
	
		System.out.println("Enter the product that you want enter :");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			
			System.out.println("Enter the product id :");
			 int id = sc.nextInt();
			System.out.println("Enter the product quantity :");
			int quantity = sc.nextInt();
			
			
			ShoppingCart shoppingCart = new ShoppingCart();
			shoppingCart.addToCart(id,quantity);
			
		}	
	}
	
	public  void addToCart(int id , int quantity) {
		
		int a = 0;
		
		try {
			
			ConnectionExample connectionExample = new ConnectionExample();
			Connection con  = connectionExample.getConnection();
			PreparedStatement ps  = con.prepareStatement("select * from product where idproduct=?");
			
			ps.setInt(1,id);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				
			 a = rs.getInt("price");
				
			}
			
			items.add(new product(id, quantity, a));
			
			ShoppingCart shoppingCart = new ShoppingCart();
			shoppingCart.calculateTotalBill();
	
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
	
	

	
	
	public void calculateTotalBill() {
		
        int totalBill = 0;
        
        for (product item : items) {
        	
            totalBill = totalBill + (item.getPrice() * item.getQuantity());
            
        }
        
        
        System.out.println("Total bill of the customer is :"+totalBill);
        
    }
	
	
	
	
	
	
	
	
	
	

}
