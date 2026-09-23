package com.javaintro;

import java.util.Scanner;

public class Ifelsedemo0 {

	public static void main(String[] args) {
		// grade based on percentage
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your percentage to know grade");
		double per = sc.nextDouble();
		
		sc.close();
		
		
		if(per >=35 && per <= 59)
		{
			System.out.println("you are on grade e ");
		}
		else if(per >=60 && per <= 69)
		{
			System.out.println("you are on grade d ");
		}
		else if(per >=70 && per <= 79)
		{
			System.out.println("you are on grade c ");
		}
		else if(per >=80 && per <= 89)
		{
			System.out.println("you are on grade b ");
		}
		else if(per >=90 && per <= 100)
		{
			System.out.println("you are on grade a ");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
