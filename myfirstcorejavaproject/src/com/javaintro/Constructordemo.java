package com.javaintro;

public class Constructordemo {
	
	
	String name;
	int age;
	
	// default constructor
	Constructordemo()
	{
		name = "likith";
		age = 21;
	}
	
	
	void display()
	{
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		
		System.out.println("hi from main method");
		
		
		Constructordemo q1 = new Constructordemo();
		
		q1.display();
		
	}

}
