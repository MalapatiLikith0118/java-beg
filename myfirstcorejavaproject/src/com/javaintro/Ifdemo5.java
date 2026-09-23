package com.javaintro;

import java.util.Scanner;

public class Ifdemo5 {

	public static void main(String[] args) {
		// atm withdrawl
		
		int avail = 50000;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount to withdraw");
		int with = sc.nextInt();
		sc.close();
		
		if (avail>with)
		{
			System.out.println(with+" avilabe for withdraw");
		}
		else
		{
			System.out.println("insufficient balance");
		}
	}

}
