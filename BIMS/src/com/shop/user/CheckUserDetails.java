package com.shop.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class CheckUserDetails {
	
	public void getDetails() {
		
		String a = null ;
		String b = null ;
		
		try {
			
			ConnectionExample connectionExample = new ConnectionExample();
			Connection con = connectionExample.getConnection();
        	
        	System.out.println("Enter the username :");
        	Scanner sc = new Scanner(System.in);
        	String  name = sc.next();
        	System.out.println("Enter the password :");
        	String pass = sc.next();
			
			PreparedStatement ps = con.prepareStatement("select * from user where username=? and password=? ");
			
			     ps.setString(1,name);
			     ps.setString(2,pass);
			
	              ResultSet rs = ps.executeQuery();
	                 
	            while(rs.next()) {
	            	
	            	 a = rs.getString("username");
	            	 b = rs.getString("password");
	            	
	            }
	            
	            if (name.equals(a)  && pass.equals(b)) {
             		
             		System.out.println("Username and password is coorect..");
 					
 				} else {
 					
 					System.out.println("invalid input...");

 				}
	        
	            con.close();
	            ps.close();
	            rs.close();
	       
		} catch (Exception e) {

         e.printStackTrace();
			
		}
		
	}

}
