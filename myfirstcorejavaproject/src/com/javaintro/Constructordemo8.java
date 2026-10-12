package com.javaintro;

public class Constructordemo8 {
	
	
	int lenght ;
	int breadth ;
	
	
	Constructordemo8()
	{
		
		System.out.println("No arg constructor called ");
		
		lenght = 10;
		breadth = 15;
		
		
	}
	
	void main()
	{
		Constructordemo8 q1 = new Constructordemo8();
		q1.show();
	}
	
	
	void show()
	{
		int area = lenght * breadth;
		
		System.out.println("area is"+ area);
	}
	

	}


