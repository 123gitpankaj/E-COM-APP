package com.shop.user;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("****************************************");
		
		System.out.println("Welcome to E-Commerce based application");
		
		System.out.println("****************************************");

		
		System.out.println("User Operation");
		
		System.out.println("     "+"1. User Registration");
		
		System.out.println("     "+"2. User Login");

		System.out.println("     "+"3. User view Product item as Sorted Order");

		System.out.println("     "+"4. Buy Product");
		
		System.out.println("     "+"5. View Cart ");
		
		System.out.println("     "+"6. Purchase the item ");
		
		
		System.out.println("Admin Operation");

		System.out.println("     "+"7. Add product item");
		
		System.out.println("     "+"8. Calculate Bill");

		System.out.println("     "+"9. Display amount to End User");

		System.out.println("     "+"10.Check Quantity");
		
		System.out.println("     "+"11. Check registered user");

		System.out.println("     "+"12. Check the particular user history");

		
		System.out.println("Guest Operation");
		
		System.out.println("     "+"13. View product item");

		System.out.println("     "+"14. Not purchase item");
		
		
		System.out.println("Enter Your Choice..");
		
		Scanner sc = new Scanner(System.in);
		
		int key = sc.nextInt();
		
		switch (key) {
		case 1:
			   UserRegistration registration = new UserRegistration();
			   registration.getUserInputDetails();
			break;
		case 2:
			   CheckUserDetails checkUserDetails = new CheckUserDetails();
			   checkUserDetails.getDetails();
			break;
		case 3:
			   ProductDetails details = new ProductDetails();
			   details.getProductDetails();
			break;
		case 4:
			   BuyProducts buyProducts = new BuyProducts();
			   buyProducts.buyProduct();
			break;	
		case 5:
			  BillGeneration generation = new BillGeneration();
			  generation.getBill();
		default:
			break;
		}


	}

}
