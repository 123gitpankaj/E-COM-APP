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
		default:
			break;
		}
		
	}

}
