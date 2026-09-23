package com.javaintro;

public class Constructor_using_parameters0 {
	
	String carname;
	String company;
	int cc;
	String color;
	int cost;
	
	Constructor_using_parameters0()
	{
		this("Sonet","kia");
		System.out.println("no arg constructor executed");
	}
	
	Constructor_using_parameters0(String carname, String company)
	{
		System.out.println("2 arg constructor executed");
		this(carname, company, 1500);
	}
	
	Constructor_using_parameters0(String carname, String company, int cc)
	{
		this(carname,company, cc, "white");
		System.out.println("3 arg conatructor executed");
	}
	
	Constructor_using_parameters0(String carname, String company, int cc, String color)
	{
		this(carname, company, cc, color, 1500000);
	}
	
	Constructor_using_parameters0(String carname, String company, int cc, String color, int cost)
	{
		this.carname = carname;
		this.company = company;
		this.cc = cc;
		this.color = color;
		this.cost = cost;
		
	}
	

	public static void main(String[] args) {
		
		Constructor_using_parameters0	q1  = new Constructor_using_parameters0();
		q1.display();
		
		
		Constructor_using_parameters0 q2 = new Constructor_using_parameters0("seltos","kia",1500,"blue", 1800000);
		q2.display();
		
		
		// if i want to create an new vehicle which will be launched soon but only car name has reveled then i should get out put as pajero sport, mistubushi only sir
		//but i am getting like this 
		Constructor_using_parameters0 q3 = new Constructor_using_parameters0("pajero sport","Mistubushi");
		q3.display();
		

	}
	
	void display()
	{
	System.out.println(carname);	
	System.out.println(company);	
	System.out.println(cc);
	System.out.println(color);	
	System.out.println(cost);	

	}

}
