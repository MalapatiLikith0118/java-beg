package com.javaintro;

import java.util.Scanner;

public class SwitchNesteddemo1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double bankBalance = 50000;
		double availableBal = 0;
		
		System.out.println("Welcome to bank you have two options to manage");
		System.out.println("1. Withdrawl");
		System.out.println("2. Deposit");
		
		System.out.println("Enter your options");
		int option = sc.nextInt();
		
		switch(option)
		{
		case 1:
			System.out.println("Choose amount to withdrw the amount");
			System.out.println("1. 500 ");
			System.out.println("2. 1000");
			System.out.println("3  5000");
			System.out.println("Enter your choice to make trancation");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: 
				System.out.println("the entered amount has with drawn sucessfully");
				availableBal = bankBalance - 500;
				System.out.println("available balance is "+availableBal);
				break;
				
			case 2: 
				System.out.println("the entered amount has with drawn sucessfully");
				availableBal = bankBalance - 1000;
				System.out.println("available balance is "+availableBal);
				break;
				
			case 3: 
				System.out.println("the entered amount has with drawn sucessfully");
				availableBal = bankBalance - 5000;
				System.out.println("available balance is "+availableBal);
				break;
				
				default:
					System.out.println("the entered amount is not in the list");
					break;
			}
			break;
			
			
			
			
		case 2:
			System.out.println("Enter amount to deposit the aount");
			System.out.println("1. 500");
			System.out.println("2. 1000");
			System.out.println("3. 5000");
			System.out.println("Enter your choice to make trancation");
			int choice1 = sc.nextInt();
			
			switch(choice1)
			{
			case 1: 
				System.out.println("the entered amount has deposit sucessfully");
				availableBal = bankBalance + 500;
				System.out.println("available balance is "+availableBal);
				break;
				
			case 2: 
				System.out.println("the entered amount has deposit sucessfully");
				availableBal = bankBalance + 1000;
				System.out.println("available balance is "+availableBal);
				break;
				
			case 3: 
				System.out.println("the entered amount has deposit sucessfully");
				availableBal = bankBalance + 5000;
				System.out.println("available balance is "+availableBal);
				break;
				
				default:
					System.out.println("the entered amount is not in the list");
					break;
			}
			break;
		
		}
		
		
	}

}
