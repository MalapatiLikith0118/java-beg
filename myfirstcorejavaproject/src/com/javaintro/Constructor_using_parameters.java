package com.javaintro;

public class Constructor_using_parameters {
	
	
	String bikename;
	int year;
	double price;
	int cc;
	int topspeed;
	String biketype;
	
	
	Constructor_using_parameters(String bikename, int year, int cc, int topspeed, String biketype)
	// we can assign values using variables but this makes more easier to understand
	{
		this.bikename =  bikename;
		this.year = year;
		this.cc = cc;
		this.topspeed = topspeed;
		this.biketype = biketype;
	}

	public static void main(String[] args) {
		
		// always when we use parameterized constructor we should assign the values in constructor here ;
		Constructor_using_parameters q1 = new Constructor_using_parameters("himalayan 450", 2027, 450, 160, "ADV");
		
		q1.Constructor_using_parametersinfo();
		
		Constructor_using_parameters q2 = new Constructor_using_parameters("duke 390 ADV", 2027, 399,180,"Street racing");
		q2.Constructor_using_parametersinfo();
		
	}
	
	
	void Constructor_using_parametersinfo()
	{
		System.out.println(bikename);
		System.out.println(year);
		System.out.println(cc);
		System.out.println(topspeed);
		System.out.println(biketype);

	}

}
