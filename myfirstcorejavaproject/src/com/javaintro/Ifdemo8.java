package com.javaintro;

import java.util.Scanner;

public class Ifdemo8 {

	public static void main(String[] args) {
		// free delivery
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total amount for shopping");
		double total = sc.nextDouble();
		
		sc.close();
		
		if(total > 150)
		{
			System.out.println("you are eligible for free delivery");
		}
		else
		{
			System.out.println("you will be charged for delivery");
		}
		
	}

}
