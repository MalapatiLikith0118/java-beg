package com.javaintro;

public class Constructordemo2 {
	
	int rollno;
	String name;
	int age;
	
	Constructordemo2(int rollno1, String name1, int age1)
	{
		rollno = rollno1;
		name = name1;
		age = age1;
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
