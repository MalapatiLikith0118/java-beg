package com.javaintro;

import java.util.Scanner;

public class Constructordemo10 {
	
	String name;
	int id;
	double sal;
	String company;
	int age;
	
	
	
	Constructordemo10()
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name");
		name = sc.nextLine();
		
		System.out.println("Enter emp id");
		id = sc.nextInt();
		
		System.out.println("Enter salary");
		sal = sc.nextDouble();
		
		System.out.println(("enter age"));
		age = sc.nextInt();
		
		sc.close();
		
		
	}
	
	/*
	 * void Constructordemo10() {
	 * System.out.println("from constructor named method"); }
	 */
	
	
	void show() {
		
		
		System.out.println("Name is "+ name);
		System.out.println("id is "+ age);
		System.out.println("Salary is"+ sal);
		System.out.println("age is "+ age);

	}

	public static void main(String[] args) {
		
		Constructordemo10 q1 = new Constructordemo10();
		
		q1.show();
//		q1.Constructordemo10();
		
		
	}

}
