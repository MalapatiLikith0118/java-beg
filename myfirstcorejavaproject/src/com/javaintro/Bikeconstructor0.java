package com.javaintro;

public class Bikeconstructor0 {
	
	String bikename;
	String company;
	double price;
	String biketype;
	int year;
	
	Bikeconstructor0()
	{
		this("unknown", "unknown");
	System.out.println("no arg constructor called");
	}
	
	Bikeconstructor0(String bikename, String company)
	{
		this(bikename, company,100000);

	//	this("unknown","Royal enfield",450000.00,"ADV",2026);
//		this.bikename = bikename;
//		this.company = company;
//		this.price = price;
//		this.biketype = biketype;
////		this.year = year;
	
	}
	
	Bikeconstructor0(String bikename, String company, double price)
	{
		this(bikename, company,100000, "ADV");

	//	this("unknown","Royal enfield",450000.00,"ADV",2026);
//		this.bikename = bikename;
//		this.company = company;
//		this.price = price;
//		this.biketype = biketype;
////		this.year = year;
	
	}
	Bikeconstructor0(String bikename, String company, double price, String biketype)
	{
		this("unknown","Royal enfield",450000.00,"ADV",2026);
//		this.bikename = bikename;
//		this.company = company;
//		this.price = price;
//		this.biketype = biketype;
////		this.year = year;
		
	}
	
	Bikeconstructor0(String bikename, String company, double price, String biketype, int year)
	{
		this.bikename = bikename;
		this.company = company;
		this.price = price;
		this.biketype = biketype;
		this.year = year;
		
	}

	public static void main(String[] args) {
		
		Bikeconstructor0 q1 = new Bikeconstructor0();
		q1.bikeinfo();
		
		// q1.bikename = "himalayan220";
		
		
	}
	
	
	void bikeinfo()
	{
		System.out.println(bikename);
		System.out.println(company);
		System.out.println(price);
		System.out.println(biketype);
		System.out.println(year);
	}

}
