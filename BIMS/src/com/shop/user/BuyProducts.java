package com.shop.user;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BuyProducts {
	
	
	List<String> cartItems = new LinkedList<String>();

	public void buyProduct() {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("Enter the name of the product :");
			
			 String productName =  sc.next();
			
			if (productName.equalsIgnoreCase("done")) {
				
				System.out.println("Logout..");
				
				break;
			
			}
			
			else {
				
				cartItems.add(productName);
				
				System.out.println("Product has been added to the cart.........");
				
			}
		
		}
		
       System.out.println("products in the list are :");
       
       Collections.sort(cartItems);
		
		for (String str : cartItems) {
			
			System.out.println(str);
			
		}
		
		

		
	}

}
