package com.javaintro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Mysqlconnection {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/banking";
		String username = "root";
		String password = "9441649333";
		
		
		try {
			Connection con = DriverManager.getConnection(url,username,password);
			
			System.out.println("mysql connection was successfull");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your name:");
		String name = sc.nextLine();
		
		System.out.println("Enter your acoount number:");
		long accountnumber = sc.nextLong();
		
	}

}
