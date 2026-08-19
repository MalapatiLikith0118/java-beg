package com.javaintro;

public class Employee {
	
	// instance variables
	
	int empid;
	String name;
	double salary;
	float experience;
	char grade;
	String status;
	
	void employedetails()
	{
		System.out.println("employee id: "+ empid);
		System.out.println("employee name:"+name);
		System.out.println("employee salary: "+ salary);
		System.out.println("employee experience years: "+ experience);
		System.out.println("employee grade: "+ grade);
		System.out.println("employee status: "+ status);

	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		
		e1.empid = 1;
		e1.name = "likith";
		e1.salary = 50000;
		e1.experience = 1;
		e1.grade = 'A';
		e1.status = "full time";
		
		
		e2.empid = 2;
		e2.name = "unknown";
		e2.salary = 20000;
		e2.experience = 1;
		e2.grade = 'b';
		e2.status = "part time";
		
		
		e3.empid = 3;
		e3.name = "known";
		e3.salary = 25000;
		e3.experience = 1;
		e3.grade = 'c';
		e3.status = "temp";
		
		e1.employedetails();
		e2.employedetails();
		e3.employedetails();
		
		

		
	}

}
