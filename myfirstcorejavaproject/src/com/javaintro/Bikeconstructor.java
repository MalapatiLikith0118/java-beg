package com.javaintro;

public class Bikeconstructor {
	
	String bikename;
	String company;
	double price;
	String biketype;
	int year;
	
	
	
	Bikeconstructor(String bikename, String company, double price, String biketype, int year)
	{
		this.bikename = bikename;
		this.company = company;
		this.price = price;
		this.biketype = biketype;
		this.year = year;
		
	}

	public static void main(String[] args) {
		
		Bikeconstructor q1 = new Bikeconstructor("himalayan450","Royal enfield",450000,"ADV",2026);
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
