package com.shop.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class checkQuantity {
	
	public void getQuantity() {
		
		System.out.println("Enter the productid here :");
		Scanner sc = new Scanner(System.in);
		  int id = sc.nextInt();
		
		
		try {
			 ConnectionExample connectionExample = new ConnectionExample();
		     Connection con = connectionExample.getConnection();
		                    
		     PreparedStatement ps = con.prepareStatement("select * from product where idproduct = ?");
		     
		     ps.setInt(1,id);
		     
		      ResultSet rs   = ps.executeQuery();
		
		      
		      while (rs.next()) {
				
		    System.out.println("Quantity of the product is :"+rs.getInt("quantity"));
		    	  
		    	  
			}
		      
		      
		      
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
	}

}
