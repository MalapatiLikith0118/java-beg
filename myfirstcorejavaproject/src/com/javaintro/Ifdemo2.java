package com.javaintro;

import java.util.Scanner;

public class Ifdemo2 {

	public static void main(String[] args) {
		// sleep cycle
		
		System.out.println("main method started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your sleep time");
		int sleep = sc.nextInt();
		sc.close();
		
		if (sleep >=8)
		{
			System.out.println("good sleep");
		}
		else if (sleep >= 6)
		{
			System.out.println("insufficiant sleep");
		}
		else
		{
			System.out.println("heannnnn");
		}
	}

}
