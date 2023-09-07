package com.shop.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BillGeneration {
	
	public void getBill() {
		
		try {
			
			 ConnectionExample connectionExample = new ConnectionExample();
			 Connection con = connectionExample.getConnection();
			 
			 System.out.println("Enter the name of the user :");
			
			 Scanner sc = new Scanner(System.in);
			 
			 String userName = sc.nextLine();
			
			 ResultSet resultSet = retrieveCustomerProducts(con,userName);
			
			 double totalBill =  calculateBill(con,resultSet);
			 
			 System.out.println("Total bill of the customer is :"+totalBill);
			
			
		} catch (Exception e) {

			e.printStackTrace();
			
		}
		
	}
	
	
	 public static ResultSet retrieveCustomerProducts(Connection con , String name) throws SQLException{
		 
		 PreparedStatement ps = con.prepareStatement("select * from cart where username=?");
		 
		 ps.setString(1,name);
		 
		 ResultSet rs = ps.executeQuery();
		 
		return rs; 
		 
	 }
	 
	 
	 
	 public static double calculateBill(Connection con,ResultSet resultSet) throws SQLException {
		 
		 double totalBill = 0.0;
		 
		 while (resultSet.next()) {
			
			 int id = resultSet.getInt("idproduct");
			 
			 int quantty = resultSet.getInt("quantity");
			 
			 int a = getProductPrice(con,id);
			 
			 totalBill = totalBill + (quantty * a);
		 
		}
	 
		return totalBill;
		
	 }
	 
	 
	 public static int getProductPrice(Connection con ,int id) throws SQLException {
		 
		 PreparedStatement ps = con.prepareStatement("select * from product where idproduct = ?");
		 
		 ps.setInt(1,id);
		 
		 ResultSet rs = ps.executeQuery();
		 
		 if (rs.next()) {
			
		   return rs.getInt("price");
			
		}
		 
		return 0; 
		 
		 
	 }

	
	
	
	
	

}
