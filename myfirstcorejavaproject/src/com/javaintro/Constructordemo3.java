package com.javaintro;

public class Constructordemo3 {
	
	String carname;
	String company;
	double price;
	int year;
	String color;
	
	
	Constructordemo3 ()
	{
		System.out.println("no arg constructor");
	}

	
	// 2 arg parameter constructor
	Constructordemo3(String carname, String company)
	{
	this.carname = carname;
	this.company = company;
	}
	
	
	// 3 arg parameter constructor
	Constructordemo3(String carname, String company, double price)
	{
		this.carname = carname;
		this.company = company;
		this.price = price;
		
	}
	
	// 4 arg parameter constructor
	Constructordemo3(String carname, String company, double price, int year)
	{
		this.carname = carname;
		this.company = company;
		this.price = price;
		this.year = year;
	}
	
	Constructordemo3(String carname, String company, double price, int year, String color)
	{
		this.carname = carname;
		this.company = company;
		this.price = price;
		this.year = year;
		this.color = color;
	}
	

	public static void main(String[] args) {
		
		Constructordemo3 q1 = new Constructordemo3("sonet", "kia");
		q1.carinfo();
				
		Constructordemo3 q2 = new Constructordemo3();
		q2.carinfo();
		
		Constructordemo3 q3 = new Constructordemo3("seltos", "kia", 1700000.00);
		q3.carinfo();
		
		Constructordemo3 q4 = new Constructordemo3("fortuniner", "toyota", 4500000.00,2025);
		q4.carinfo();
		
		Constructordemo3 q5 = new Constructordemo3("fortuniner", "toyota", 4500000.00,2025,"color");
		q5.carinfo();
				

		
	}
	
	void carinfo()
	{
		System.out.println("name of the car :"+ carname);
		System.out.println("name of the variant :"+ company);
		System.out.println("name of the price :"+ price);
		System.out.println("name of the year :"+ year);
		System.out.println("name of the color :"+ color);
		System.out.println("***************************************");

	}

}
