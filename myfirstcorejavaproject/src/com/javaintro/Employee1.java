package com.javaintro;

public class Employee1 {
	
	
	
	

	public static void main(String[] args) {
		
		
		Employee1 e1 = new Employee1();
		
		e1.employeename();
		e1.employeeid();
		e1.department();
		e1.salary();
		e1.experience();
		e1.compnyname();
		
		
	}
	void employeename()
	{
		String employname = "likith";
		System.out.println(employname);
		
	}
	
	void employeeid()
	{
	int empid = 100123;
	System.out.println(empid);	
	}
	
	void department()
	{
	String departmentname = "Software ";
	System.out.println(departmentname);
	}
	
	void salary()
	{
	float salary = 50000.00f;
	System.out.println(salary);
	}
	
	void experience()
	{
	int exp = 5;
	System.out.println(exp);	
	}
	
	void compnyname()
	{
	String companyname = "unknown";
	System.out.println(companyname);	
	}
	

}
