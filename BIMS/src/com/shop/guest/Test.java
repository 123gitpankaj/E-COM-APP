package com.shop.guest;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the condition no :");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		
		switch (key) {
		case 1:
			   ProductList productList = new ProductList();
			   productList.getProducts();
			break;
		default:
			break;
		}
		
	}

}
