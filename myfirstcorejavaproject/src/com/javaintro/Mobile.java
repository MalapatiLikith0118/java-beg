package com.javaintro;

public class Mobile {
	
	// static variable
	
	static String company = "Samsung";
	
	
	// instance variable
	String brand ;
	String model;
	int price;
	int ram;
	
	
	//static block
	static {
		System.out.println("from static block\n");
	}
	
	// instance block
	{
		System.out.println("from instance block\n");
	}
	
	// static method
	static void companydetails()
	{
		System.out.println("from static methos\n");
		System.out.println(company);
	}
	
	// instance method
	void phonedetails()
	{
		System.out.println("from instance method");
		System.out.println("brand name: "+ brand);
		System.out.println("Model name: "+ model);
		System.out.println("price:"+ price);
		System.out.println("installed ram: "+ ram);
	}
	
	
	public static void main(String[] args) {
		
		Mobile m1 = new Mobile();
		Mobile m2 = new Mobile();
		Mobile m3 = new Mobile();
		
		
		
		
		m1.brand = "samsung";
		m1.model = "S25";
		m1.price = 110000;
		m1.ram = 12;
		
		m2.brand = "apple";
		m2.model = "17 pro";
		m2.price = 130000;
		m2.ram = 12;
		
		m3.brand = "IQOO";
		m3.model = "15";
		m3.price = 65000;
		m3.ram = 12;
		
		
		m1.phonedetails();
		m2.phonedetails();
		m3.phonedetails();
		
		
		
	}

}

