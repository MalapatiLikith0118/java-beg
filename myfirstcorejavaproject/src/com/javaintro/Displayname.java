package com.javaintro;

import java.util.Scanner;

public class Displayname {
	
	

	public static void main(String[] args) {
		
		System.out.println("Welcome to school portal");
		
		Scanner sc = new Scanner(System.in);
		
		Displayname d1 = new Displayname();
		
		
		
		System.out.println("enter name to proceed: ");
		String name = sc.next();
		
		
		System.out.println("enter age: ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		
		System.out.println("enter discription about: ");
		String details = sc.nextLine();
		
		
		System.out.println("enter gender: ");
		char gender = sc.next().charAt(0);
		
		
		System.out.println("enter rollno: ");
		long rollno = sc.nextLong();
		
		System.out.println("------------------------details------------------------");
		
		d1.displayname(name);
		d1.displayage(age);
		d1.displaydetails(details);
		d1.gender(gender);
		d1.rollno(rollno);
		
		System.out.println("you have been loged out!!");
	}
	
	void displayname(String name)
	{
		System.out.println("Name is: "+ name);
	}
	
	void displayage(int age)
	{
		System.out.println("age is: "+age);
	}
	
	void displaydetails(String details)
	{
		System.out.println("Description :"+ details);
	}
	
	void gender(char gender)
	{
		System.out.println("gender: "+ gender);

	}
	
	void rollno(long rollno)
	{
		System.out.println("rollno: "+ rollno);

	}

}








