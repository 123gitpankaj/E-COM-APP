package com.shop.user;

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
			ProductDisplay productDisplay = new ProductDisplay();
			productDisplay.dispalyProducts();
			break;	
		case 6:
			BuyProducts buyProducts = new BuyProducts();
			buyProducts.buyProduct();
			break;	
		case 7:
			onlyRegisteredUser registeredUser = new onlyRegisteredUser();
			registeredUser.getEntry();
		default:
			break;
		}
		
	}

}
