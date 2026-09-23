package com.javaintro;

import java.util.Scanner;

public class Ifdemo7 {

	public static void main(String[] args) {
		// emi based on sal
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your sal to check safe emi");
		double sal = sc.nextDouble();
		
		System.out.println("enter your  emi");
		double emi = sc.nextDouble();
		
		sc.close();
		
		if (emi<= 0.30*sal)
		{
			System.out.println("your emi in safe zone");
		}
		else
		{
			System.out.println("your emi has in warning zone");
		}
	}

}
