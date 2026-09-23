package com.javaintro;

public class Constructordemo4 {
	
	int id;
	String name;
	
	Constructordemo4()
	{
		name = "likith";
		id = 1001;
	}
	

	public static void main(String[] args) {
		
		
		Constructordemo4 q1 = new Constructordemo4();
		q1.Constructordemo4info();
		
	}
	
	void Constructordemo4info()
	{
	System.out.println(id);	
	System.out.println(name);
	}

}
