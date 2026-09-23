package com.javaintro;

import java.util.Scanner;

public class Ifdemo0 {

	public static void main(String[] args) {
// checking marriage eligibility		
		System.out.println("main method started");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter men age to check");
		int age = sc.nextInt();
		
		System.out.println("enter women age to check");
		int age2 = sc.nextInt();
		sc.close();
		
		if (age >=22 && age2 >= 21 )
		{
			System.out.println("both are eligible");
		}
		else
		{
			System.out.println("either one is not matching");
		}
		
	}

}
