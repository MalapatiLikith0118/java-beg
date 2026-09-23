package com.javaintro;

import java.util.Scanner;

public class Ifelsedemo4 {

	public static void main(String[] args) {
		// electricity
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("enter your units");
		double unit = sc.nextDouble();
		
		sc.close();
		
		if (unit >= 600) 
		{
			System.out.println("very high consumption");
		}
		else if(unit>=400)
		{
			System.out.println("high consumption");
		}
		else if(unit >= 200)
		{
			System.out.println("medium consumption");
		}
		else if(unit >=100)
		{
			System.out.println("low consumption");
		}
		
	}

}
