package com.shop.user;

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
			
			PreparedStatement ps = con.prepareStatement("select * from  product  order by name ASC ");
			
	         ResultSet rs =  ps.executeQuery();
			
			while (rs.next()) {
				
				
					System.out.println("Product Name>"+rs.getString("name"));
					System.out.println("Product Description"+rs.getString("description"));
					System.out.println("Available Quantity:"+rs.getInt("quantity"));
					System.out.println("Price>>"+rs.getString("price"));

				
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
