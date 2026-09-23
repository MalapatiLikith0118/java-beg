package com.javaintro;

public class Constructordemo0 {
	
	
	String bikename = "duke";
	int price = 1500000; 
	
	

	public static void main(String[] args) {
		
		Constructordemo0 q1 = new Constructordemo0();
		
		q1.Constructordemo();
		
		
	}
	
	
	Constructordemo0()
	{
		
	}
	
	void Constructordemo()
	{
		System.out.println(bikename);
		System.out.println(price);
	}

}
