package com.javaintro;

public class Constructordemo1 {
	
	int rollno;
	String name;
	int age;
	
	Constructordemo1(int rollno, String name, int age)
	{
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	

	public static void main(String[] args) {
		
		
		Constructordemo1 q1 = new Constructordemo1(80070,"likith",21);
		
		Constructordemo1 q2 = new Constructordemo1(80038,"manmith",21);
		
		q1.display();
		q2.display();
		
	}
	
	
	void display()
	{
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(age);
	}

}
