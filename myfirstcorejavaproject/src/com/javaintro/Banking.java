package com.javaintro;

import java.util.Scanner;

public class Banking {
	
	double accountbalance = 0;

	public static void main(String[] args) {
		
		System.out.println("Welcome to online banking service");
		
		Scanner sc = new Scanner(System.in);
		
		Banking b1 = new Banking();
		
		System.out.println("enter amount to deposit");
		double depamount = sc.nextDouble();	
		b1.diposit(depamount);
		
		
		System.out.println("enter amount to withdaw");
		double withdrawamount = sc.nextDouble()	;	
		b1.withdraw(withdrawamount);
		
		b1.showbalance();
		
	}
	
	
	void diposit (double depamount)
	{
		depamount = depamount + accountbalance;
		System.out.println("deposited amount is "+ depamount);
	}
	
	void withdraw (double withdrawamount)
	{
		accountbalance = accountbalance- withdrawamount;
		System.out.println("withdrawamount amount is "+ withdrawamount);

	}
	
	void showbalance( )
	{
		System.out.println("available balance"+ accountbalance);

		
	}

}
