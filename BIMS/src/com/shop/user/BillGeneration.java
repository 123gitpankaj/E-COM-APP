package com.shop.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.shop.Admin.ConnectionExample;

public class BillGeneration {
	
	
	public static void getResponse() {
		
		System.out.println("Enter the product id to buy product :");
		Scanner sc = new Scanner(System.in);
	     int  prodID = sc.nextInt();
		System.out.println("Enter the quantity :");
	     int  prodQuantty = sc.nextInt();
	      
	      System.out.println("Do you want to view cart (Yes/No)");
	          String  ans = sc.next();
	      
	      if (ans.equals("yes")) {
	    	  
           System.out.println("Product has been added to the cart ....");
           passBill(prodID,prodQuantty);
           
		} else {
			
			System.out.println("Ok...No-Problem");

		}
	
	}
	
		public static void passBill(int ID , int Quantity) {
			
			int prise = 0;
			 
			try {
				ConnectionExample connectionExample = new ConnectionExample();
				Connection con  = connectionExample.getConnection();
				
				PreparedStatement ps = con.prepareStatement("select * from product where idproduct=? ");
			
				  ps.setInt(1,ID);
			  
			     ResultSet rs =  ps.executeQuery();
			     
			     while (rs.next()) {
					
			    	prise = rs.getInt("price");
			    	
				}
			     
			     calculateBill(Quantity,prise);
			    	            
			} catch (Exception e) {
				
				e.printStackTrace();
			}	
	}
		
		
		public static void  calculateBill(int quant , int value) {
			
			int totalbill = 0;
			
			totalbill = totalbill +(quant * value) ;
			
			System.out.println("Do You want mote items :");
			
		   Scanner sc = new Scanner(System.in);
		   
		   String  ans1 = sc.next();
		   
		   
		 if (ans1.equals("yes")) {
			
			 getResponse();
			   
			   
		} else {
			
			System.out.println("Total bill of the customer is :"+totalbill);

		}
			 
		}
		
		
	
}
