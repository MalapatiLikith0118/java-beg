package com.javaintro;
public class Loanmanagement {
	
	
	
	String customername;
	double loanamount;
	double interestrate;
	int loantenure;
	double totalloan;
	double amountwithinterest;
	double monthlyemi;

	
	void bankdetails()
	{
		System.out.println("welcome to bank");
	}
	
	void takenloan()
	{
		customername = "Unknown";
		loanamount = 100000;
		interestrate = 8.0;
		loantenure = 1;
		
		
		System.out.println("customername is :"+ customername);
		System.out.println("loan amount is :"+ loanamount);
		System.out.println("interestrate is :"+interestrate);
		System.out.println("loantenure is :"+loantenure);
		
	}
	
	void caluclateintrest()
	{
		System.out.println("************************************");
		System.out.println("total loan interest for :"+loantenure+" year");
		totalloan = loanamount*interestrate/100;
		System.out.println("total interest :"+totalloan);
	}
	
	void caluclatetotalamount()
	{
	System.out.println("************************************");
	amountwithinterest = totalloan+loanamount;	
	System.out.println("toatal amount with interest :"+ amountwithinterest);
	}
	
	void caluclatemonthlyemi()
	{
	System.out.println("************************************");
	monthlyemi = amountwithinterest/12;
	System.out.println("amount with monthly emi :"+ monthlyemi);
	}
	
	void displaysummary()
	{
		caluclateintrest();
		caluclatetotalamount();
		caluclatemonthlyemi();
	}
	

	public static void main(String[] args) {
		
		Loanmanagement q1 = new Loanmanagement();
		q1.bankdetails();
		
		q1.takenloan();
		q1.displaysummary();
		
	}

}






