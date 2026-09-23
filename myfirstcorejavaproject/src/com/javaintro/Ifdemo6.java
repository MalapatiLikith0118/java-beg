package com.javaintro;

import java.util.Scanner;

public class Ifdemo6 {

	public static void main(String[] args) {
		// loan eligibility		

		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your cibil score to get loan eligibility");
		double cibil = sc.nextDouble();
		sc.close();
		
		if (cibil >= 730)
		{
			System.out.println("you are eligible for full loan");
		}
		else if(cibil >650)
		{
			System.out.println("you are elibilbe for half loan");
		}
		else
		{
			System.out.println("take care");
		}
	}

}
