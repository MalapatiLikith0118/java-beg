package com.javaintro;

import java.util.Scanner;

public class Loanmanagement0 {
	
	String customername;
	double loanamount;
	double interestrate;
	double loantenure;
	
	double totalloan;
	
	
	void bankdetails()
	{
		System.out.println("welcome to bank !!");
	}
	
	void takeloan()
	{
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter customer name");
	String customername = sc.nextLine();
	
	System.out.println("enter loan amount");
	double loanamount = sc.nextDouble();
	
	System.out.println("enter interest rate");
	double interestrate = sc.nextDouble();
	
	System.out.println("enter loan tenuren in years");
	double loantenure = sc.nextDouble();
	

	System.out.println("customer name is :"+ customername);
	System.out.println("customer loan amount  is :"+ loanamount);
	System.out.println("customer intrest rate is :"+ interestrate);
	System.out.println("customer loan tenure is :"+ loantenure);
	
	
	sc.close();

	}
	
	void caluclateinterest()
	{
		System.out.println("-------------------------------");
		totalloan = loanamount*interestrate/100;
		System.out.println("total interest :"+totalloan);
		
	}
	
	void caluclatetotalamount()
	{
		
	}
	
	void caluclatemonthlyemi() 
	{
		
	}
	
	void displaysummary()
	{
		
		takeloan();
		caluclateinterest();
		caluclatetotalamount();
		caluclatemonthlyemi();
		


		
		
	}

	public static void main(String[] args) {
		
		

		
		Loanmanagement0 q1 = new Loanmanagement0();
		
		q1.bankdetails();
		q1.displaysummary();
		
	}

}
