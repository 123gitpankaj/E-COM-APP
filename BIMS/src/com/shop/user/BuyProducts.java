package com.shop.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BuyProducts {
	
	int productID = 0;
	
	String firstName = null ;
	
	int prodQuantity = 0;
	
	public void buyProduct() {
		
		Scanner sc = new Scanner(System.in);
		
		    System.out.println("Enter the name of the customer :");
		
		    firstName = sc.next();
		    
			System.out.println("Enter the product id to buy product>");
			
			  productID =  sc.nextInt();
			 
			 System.out.println("Enter the Quantity of the product :");
			 
			  prodQuantity = sc.nextInt();
		
			  System.out.println("Do you want to view cart (Yes/No)");
				
			 String ans = sc.next();
				 
				 if (ans.equals("yes")) {
					
					 System.out.println("Product item has been added to cart");
					 
					 try {
						 
						 ConnectionExample connectionExample = new ConnectionExample();
						 
						 Connection con = connectionExample.getConnection();
						 
						 PreparedStatement ps = con.prepareStatement("insert into cart (username,idproduct,quantity) values (?,?,?)");
						 
						ps.setString(1,firstName);
						ps.setInt(2,productID);
						ps.setInt(3,prodQuantity);
						
						int  a = ps.executeUpdate();
						
						con.close();
						ps.close();
					 
					} catch (Exception e) {
						
						e.printStackTrace();
						
					}
					 
				} else {
					
					System.out.println("ThankYou...");

				}
				  
	
	}
	
	
}
