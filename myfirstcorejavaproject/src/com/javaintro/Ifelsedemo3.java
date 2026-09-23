package com.javaintro;

import java.util.Scanner;

public class Ifelsedemo3 {

	public static void main(String[] args) {
		// salary category
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your salary to mark");
		double sal = sc.nextDouble();
		
		sc.close();
		
		if (sal >= 100000) 
		{
			System.out.println("very high salary");
		}
		else if(sal>=70000)
		{
			System.out.println("high salary");
		}
		else if(sal >= 40000)
		{
			System.out.println("good salary");
		}
		else if(sal >=20000)
		{
			System.out.println("low salary");
		}
		
		else if(sal <20000)
		{
			System.out.println("low salary");
		}
		
	}

}
