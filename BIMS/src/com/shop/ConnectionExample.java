package com.shop;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionExample {
	
	public Connection getConnection() {
		
      Connection con= null ;
		
		try {
			
			Class.forName("com.jdbc.mysql.Driver");
			
			con = DriverManager.getConnection("mysql:jdbc://localhost:3306/shop","root","123456");
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
		return con ;
		
		
	}
		
		

}
