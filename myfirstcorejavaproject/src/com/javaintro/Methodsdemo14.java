package com.javaintro;

public class Methodsdemo14 {
	
	String empname;
	double salary;
	String companyname;
	
	void display()
	{
	System.out.println("name is "+ empname);
	System.out.println("slalry is "+ salary);
	System.out.println("company name is "+ companyname);
	}

	public static void main(String[] args) {
		
		Methodsdemo14 q1 = new Methodsdemo14();
		
		
		q1.empname = "likith";
		q1.salary = 100000;
		q1.companyname = "something";
		
		q1.display();
		
		
	}

}
