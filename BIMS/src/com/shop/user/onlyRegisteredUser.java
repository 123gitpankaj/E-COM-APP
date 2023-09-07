package com.shop.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class onlyRegisteredUser {
	
	public void getEntry() {
		
		
		List<String> list = new ArrayList<String>();


		System.out.println("Enter the first name of user :");
		Scanner sc = new Scanner(System.in);
		String ans = sc.next();
		
		try {
			
			ConnectionExample connectionExample = new ConnectionExample();
			Connection con = connectionExample.getConnection();
			PreparedStatement ps = con.prepareStatement("select *  from user ");
			
		    ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				
				String a = rs.getString("first_name");
				
				list.add(a);
			
			}
	
			if (list.contains(ans)) {
				
				BuyProducts buyProducts = new BuyProducts();
				buyProducts.buyProduct();
				
			} else {
				
				System.out.println("Pls REgistered...");

			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
		
	}

}
