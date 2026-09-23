package com.javaintro;

import java.util.Scanner;

public class Ifdemo {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your age ");
		int age = sc.nextInt();
		sc.close();
		
		if (age >= 18)
		{
			System.out.println("you are eligible");
		}
		else
		{
			System.out.println("good byee");
		}
	}

}
