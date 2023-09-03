package com.shop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class CheckUserDetails {
	
	public void getDetails() {
		
		try {
			
			ConnectionExample connectionExample = new ConnectionExample();
			Connection con = connectionExample.getConnection();
			
			PreparedStatement ps = con.prepareStatement("select username,password from user where iduser='1' ");
			
	                 ResultSet rs = ps.executeQuery();
	                 
	            while(rs.next()) {
	            	
	            	String a = rs.getString("username");
	            	String b = rs.getString("password");
	            	
	            	System.out.println("Enter the username :");
	            	Scanner sc = new Scanner(System.in);
	            	String  name = sc.next();
	            	System.out.println("Enter the password :");
	            	String pass = sc.next();
	            	
	            	
	            	if (name.equals(a)  && pass.equals(b)) {
	            		
	            		System.out.println("Username and password is coorect..");
						
					} else {
						
						System.out.println("invalid input...");

					}
	            }
	            
	            con.close();
	            ps.close();
	            rs.close();
	            
			
		} catch (Exception e) {

         e.printStackTrace();
			
		}
		
	}

}
