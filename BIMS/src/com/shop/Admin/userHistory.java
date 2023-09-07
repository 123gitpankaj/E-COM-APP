package com.shop.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.shop.user.ConnectionExample;

public class userHistory {
	public void getUserHistory() {
		
		System.out.println("Enter the name of user :");
		Scanner sc = new Scanner(System.in);
		
		String ans = sc.next();
		
		try {
			
			ConnectionExample connectionExample = new ConnectionExample();
			Connection con = connectionExample.getConnection();
			
			PreparedStatement ps = con.prepareStatement("select * from user where first_name = ?");
			
			ps.setString(1,ans);
			
			ResultSet rs = ps.executeQuery();
			
			
			while (rs.next()) {
				
				System.out.println(rs.getInt("iduser"));
				System.out.println(rs.getString("first_name"));
				System.out.println(rs.getString("last_name"));
				System.out.println(rs.getString("username"));
				System.out.println(rs.getString("password"));
				System.out.println(rs.getString("city"));
    
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
