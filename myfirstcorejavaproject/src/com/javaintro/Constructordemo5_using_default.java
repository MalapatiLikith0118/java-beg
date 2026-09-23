package com.javaintro;

public class Constructordemo5_using_default {
	
	
	String name ;
	int id;
	
	
	Constructordemo5_using_default()
	{
		 name = "likith";
		 id = 1001;
	}
	
	
	

	public static void main(String[] args) {
		
		
		Constructordemo5_using_default q1 = new Constructordemo5_using_default();
		
		q1.Constructordemo5_using_defaultt();
		
		
	}
	
	void Constructordemo5_using_defaultt()
	{
		 System.out.println(name);
		 System.out.println(id);
	}

}
