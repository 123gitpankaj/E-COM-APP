package com.shop.guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.shop.user.ConnectionExample;

public class ProductList {
	
	public void getProducts() {
		
		try {
			
			ConnectionExample connectionExample = new ConnectionExample();
			Connection con = connectionExample.getConnection();
			
			PreparedStatement ps = con.prepareStatement("select name from product order by name ASC");
			
			ResultSet rs = ps.executeQuery();
			
			System.out.println("List of the product are :");

			
			while (rs.next()) {
				
				String a = rs.getString("name");
				
				System.out.println(a);
			}
			
		
		} catch (Exception e) {
			 
			e.printStackTrace();
			
		}
		
		
		
		
		
		
	}

}
