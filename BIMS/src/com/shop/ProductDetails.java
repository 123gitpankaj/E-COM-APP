package com.shop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductDetails {
	
	
	public void getProductDetails() {
		
		try {
			
			ConnectionExample connectionExample = new ConnectionExample();
			Connection con = connectionExample.getConnection();
			
			PreparedStatement ps = con.prepareStatement("select * from  product where idproduct='1'");
			
		          ResultSet rs =  ps.executeQuery();
			
			while (rs.next()) {
				
				int a = rs.getInt("idproduct");
				
				System.out.println("Enter the id of the product :");
				Scanner sc = new Scanner(System.in);
				int b = sc.nextInt();
				
				
				if (a == b) {
					
					System.out.println("Product Name>"+rs.getString("name"));
					System.out.println("Product Description"+rs.getString("description"));
					System.out.println("Available Quantity:"+rs.getInt("quantity"));
					System.out.println("Price>>"+rs.getString("price"));

				}
			}
			
			con.close();
			ps.close();
			rs.close();
			
			
			
		} 
		
		catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		
		
		
	}

}
