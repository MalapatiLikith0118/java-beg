package com.javaintro;

import java.util.Scanner;

public class Ifdemo1 {

	public static void main(String[] args) {
		// temparature
		
		System.out.println("main method started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter temp to predict todays day");
		double temp = sc.nextDouble();
		sc.close();
		
		if (temp >=30)
		{
			System.out.println("sunny day");
		}
		else if (temp>=25)
		{
			System.out.println("rainy day");
		}
		else
		{
			System.out.println("cool day");
		}
		
	}

}
