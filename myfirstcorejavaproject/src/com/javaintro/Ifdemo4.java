package com.javaintro;

import java.util.Scanner;

public class Ifdemo4 {

	public static void main(String[] args) {
		// exam result
		
		System.out.println("main method started");
		
		Scanner sc = new Scanner(System.in);
		
		 System.err.println("enter marks to check result");
		 double marks = sc.nextDouble();
		 
		sc.close();
		
		
		if (marks >=90)
		{
			System.out.println("pass grade a");
		}
		else if (marks >=80)
		{
			System.out.println("pass grade b");
		}
		else if (marks >=40)
		{
			System.out.println("pass grade c");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
