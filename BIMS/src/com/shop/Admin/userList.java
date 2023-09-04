package com.shop.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class userList {
	
	public void getUserList() {
		
		try {
			
			ConnectionExample connectionExample = new ConnectionExample();
			 Connection con =  connectionExample.getConnection();
			
			PreparedStatement ps = con.prepareStatement("select *  from user");
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				
				String a= rs.getString("first_name");
				String b = rs.getString("last_name");
				
				System.out.println("registered user are : "+a+" "+b);
			}
			
			
		} catch (Exception e) {
             e.printStackTrace();
             
      }
		
		
		
		
	}

}
