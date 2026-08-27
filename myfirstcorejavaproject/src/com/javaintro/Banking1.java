package com.javaintro;

import java.util.Scanner;

public class Banking1 {
	
	double balance = 0;

	public static void main(String[] args) {
		System.out.println("welcome to online banking");
		
		Scanner sc = new Scanner(System.in);
		
		Banking1 b1 = new Banking1();
		
		System.out.println("enter amount to deposit");
		double inputdesposit = sc.nextDouble();
		b1.deposit(inputdesposit);
		b1.balance();
		
		
		System.out.println("enter amount to make withdrawal");
		double withdrawbal = sc.nextDouble();
		b1.withdraw(withdrawbal);
		b1.balance();
		
		
		
		System.out.println("your are logged out !!");
	}
	
	
	void deposit(double depbalance)
	{
		balance = balance+depbalance;
		System.out.println(balance);
	}
	
	void withdraw(double withdrawbal)
	{
		balance = balance-withdrawbal;
		System.out.println("balance after last tranction "+ withdrawbal);
		
	}
	
	void balance ()
	{
		System.out.println("Availabe balance after last tranction: "+ balance);
	}
	
	

}
