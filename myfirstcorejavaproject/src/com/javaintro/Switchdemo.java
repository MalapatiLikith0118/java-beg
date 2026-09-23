package com.javaintro;

import java.util.Scanner;

public class Switchdemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter details to get data");
		int data = sc.nextInt();
		sc.close();
		
		switch(data)
		{
		case 18:
			System.out.println("virat kohli");
			break;
			
		case 07:
			System.out.println("ms dhoni");
			break;
			
		case 45:
			System.out.println("rohit sharma");
			break;
			
			default:
				System.out.println("the entered number is not in list");
		}
	}

}
