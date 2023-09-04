package com.shop.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.shop.Admin.ConnectionExample;

public class UserRegistration {
	
	public void getUserInputDetails() {
		
		System.out.println("Enter the first name :");
		Scanner sc = new Scanner(System.in);
		String  firstname = sc.next();
		System.out.println("Enter the last name :");
		String lastname = sc.next();
		System.out.println("Enter the username :");
		String username = sc.next();
		System.out.println("Enter the password :");
		String password = sc.next();
		System.out.println("Enter the city :");
		String city = sc.next();
        System.out.println("Enter the mailid :");
        String mailID = sc.next();
        System.out.println("Enter the mobile number :");
        String mobileno = sc.next();
        passInputUserDetails(firstname,lastname,username,password,city,mailID,mobileno);;
       
	}
	
	
	
	public void passInputUserDetails(String firstname , String lastname , String username , String password  , String city , String mailid , String mobilenumber) {
		
		try {
			
			ConnectionExample connectionExample = new ConnectionExample();
			
			       Connection con  =  connectionExample.getConnection();
			       
			       PreparedStatement  ps   = con.prepareStatement("insert into user (first_name,last_name,username,password,city,mail_id,mobile_number) values (?,?,?,?,?,?,?)" );
			
			       ps.setString(1,firstname);
			       ps.setString(2,lastname);
			       ps.setString(3,username);
			       ps.setString(4,password);
			       ps.setString(5,city);
			       ps.setString(6,mailid);
			       ps.setString(7,mobilenumber);
			       
			       int a = ps.executeUpdate();
			       
			       System.out.println("data Is Inserted..");

			       
			      con.close();
			      ps.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		
		
	}
	
	
	

}
