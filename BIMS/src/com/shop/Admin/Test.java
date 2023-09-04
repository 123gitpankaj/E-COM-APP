package com.shop.Admin;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the condition you want :");
		Scanner sc = new Scanner(System.in);
		 int key  =  sc.nextInt();
		
		
		switch (key) {
		case 1:
			checkQuantity cq = new checkQuantity();
			cq.getQuantity();
			break;
		case 2:
			userList userList = new userList();
			userList.getUserList();
			break;
		case 3:
			userHistory history = new userHistory();
			history.getUserHistory();
		default:
			break;
		}
	}

}
