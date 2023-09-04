package com.shop.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.shop.Admin.ConnectionExample;

public class ProductDisplay {
	
	
	public void dispalyProducts() {
		
		try {
			
			  ConnectionExample connectionExample = new ConnectionExample();
			  Connection con = connectionExample.getConnection();
			  PreparedStatement ps = con.prepareStatement("select name from product order by name ASC");
			  
			  ResultSet  rs =   ps.executeQuery();
			  
			  System.out.println("listList Of the product is :");
			  
			  while (rs.next()) {
				
				 String a = rs.getString("name");
				 
				 System.out.println(a);
				 
			}
			  
			  
			  
			  con.close();
			  ps.close();
			  rs.close();
			  
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		
	}

}
