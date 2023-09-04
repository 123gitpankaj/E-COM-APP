package com.shop.Admin;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionExample {
	
	public Connection getConnection() {
		
      Connection con= null ;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","123456");
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
		return con ;
		
		
	}

}
