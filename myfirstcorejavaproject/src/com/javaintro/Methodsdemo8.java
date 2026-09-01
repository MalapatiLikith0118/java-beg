package com.javaintro;

import java.util.Scanner;

public class Methodsdemo8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Methodsdemo8 q1 = new Methodsdemo8();
		
		System.out.println("enter price");
		double price = sc.nextDouble();
		
		System.out.println("enter iteamcode");
		int iteamcode = sc.nextInt();
		
		System.out.println("enter quantity");
		int quantity = sc.nextInt();
				
		q1.displayprice(price, iteamcode, quantity);
		
	}
	
	
	void displayprice(double price, int iteamcode, int quantity)
	{
		System.out.println("price of product :"+price);
		System.out.println("iteam code :"+iteamcode);
		System.out.println("iteam quantity :"+quantity);

	}

}
