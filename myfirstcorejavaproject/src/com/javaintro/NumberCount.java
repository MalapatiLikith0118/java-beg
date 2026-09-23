package com.javaintro;

import java.util.Scanner;

public class NumberCount {

	public static void main(String[] args) {
		System.out.println("Enter a number ");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
	//	int sum = sumofCount(n);
		
		NumberCount q1 = new NumberCount();
		
		
		System.out.println("the sum is"+ q1.sumofCount(n));
		
		sc.close();
		
	}

	public  int sumofCount(int n) {
		int sum = 0;
		int r = 0 ;
		
		while(n>0)
		{
			r = n % 10;
			n = n/10;
			sum = sum+r;
		}
		
		return sum;
	}

}
