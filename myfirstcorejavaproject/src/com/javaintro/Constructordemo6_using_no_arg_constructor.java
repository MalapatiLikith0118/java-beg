package com.javaintro;

public class Constructordemo6_using_no_arg_constructor {
	
	
	String bikename;
	int year;
	double price;
	
	
	Constructordemo6_using_no_arg_constructor()
	{
		this.bikename = "himalayan 450";
		this.year = 2027;
		this.price = 450000;
	}

	public static void main(String[] args) {
		
		Constructordemo6_using_no_arg_constructor q1 = new Constructordemo6_using_no_arg_constructor();
		
	//	Constructordemo6_using_no_arg_constructor q2 = new Constructordemo6_using_no_arg_constructor();
		
		q1.Constructordemo6_using_no_arg_constructorinfo();
	//	q1.Constructordemo6_using_no_arg_constructorinfo();
		
		
		
		
	}
	
	void Constructordemo6_using_no_arg_constructorinfo()
	{
		System.out.println(bikename);
		System.out.println(year);
		System.out.println(price);
	}

}
