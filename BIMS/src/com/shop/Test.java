package com.shop;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the choice :");
		
		Scanner sc = new Scanner(System.in);
		
		int key = sc.nextInt();
		
		switch (key) {
		case 1:
			   UserRegistration userRegistration = new UserRegistration();
			   userRegistration.getUserInputDetails();
			break;
		case 2:
			   CheckUserDetails checkUserDetails = new CheckUserDetails();
			   checkUserDetails.getDetails();
			   break;
		case 3:
			  ProductDetails productDetails =  new ProductDetails();
			  productDetails.getProductDetails();
			  break;
		case 4:
			BillGeneration billGeneration = new BillGeneration();
			billGeneration.getResponse();
			break;
		case 5:
			ShoppingCart shoppingCart = new ShoppingCart();
			shoppingCart.fillCarts();
			break;		
		default:
			break;
		}
		
	}

}
