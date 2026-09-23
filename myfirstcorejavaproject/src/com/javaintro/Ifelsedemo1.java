package com.javaintro;

import java.util.Scanner;
public class Ifelsedemo1 {

	public static void main(String[] args) {
		// temperature
		
		Scanner sc = new Scanner(System.in);
		
		System.err.println("enter temperature");
		double temp = sc.nextDouble();
		
		sc.close();
		
		
		if (temp >=0 && temp <=10)
		{
			System.out.println("Condition is freezing");
		}
		else if(temp>=11 && temp<=19)
		{
			System.out.println("condition is very cold");
		}
		else if(temp>=20 && temp<=27)
		{
			System.out.println("condition is  cold");
		}
		else if(temp>=28 && temp<=35)
		{
			System.out.println("condition is normal");
		}
		else if(temp>=36 && temp<=45)
		{
			System.out.println("condition is hot");
		}
		else if(temp >46)
		{
			System.out.println("very hot");
		}
		
	}

}
