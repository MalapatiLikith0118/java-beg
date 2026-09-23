package com.javaintro;

import java.util.Scanner;

public class ReverseNumberCount {

	public static void main(String[] args) {
		System.out.println("Enter number to make it reverse");
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		long reverse = doReverse(n);
		
		System.out.println(reverse);
		
		if(n==reverse)
			System.out.println("is palindrome");
		else
			System.err.println("not palindrome");
		
		sc.close();
		
	}

	 static long doReverse(long n) {
		long sum = 0;
		long r = 0 ;
		while(n>0)
		{
			r = n % 10;
			n = n / 10;
			sum = sum * 10 + r ;
		}
		return sum;
	}

}
