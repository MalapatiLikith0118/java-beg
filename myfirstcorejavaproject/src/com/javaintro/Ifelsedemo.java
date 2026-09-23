package com.javaintro;

import java.util.Scanner;

public class Ifelsedemo {

	public static void main(String[] args) {
		// age category
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter age to see age category");
		int age = sc.nextInt();
		
		sc.close();
		
		if(age >= 0  && age <= 6)
		{
			System.out.println("your age group belongs to kids");
		}
		else if(age>= 7 && age <=12)
		{
			System.out.println("you bleongs to children");
		}
		else if(age>= 13 && age <=20)
		{
			System.out.println("you bleongs to teen");
		}
		else if(age>= 21 && age <=30)
		{
			System.out.println("you bleongs to yong");
		}
		else if(age>= 31 && age <=60)
		{
			System.out.println("you bleongs to men");
		}
		else
		{
			System.out.println("you belongs to old age");
		}
		
	}

}
