package com.javaintro;

public class Methodsdemo11 {

	public static void main(String[] args) {
		
		Methodsdemo11 q1 = new Methodsdemo11();
		
		q1.displaymobile();
		
		
	}
	
	void displaymobile()
	{
		System.out.println(priceofmobile());
		System.out.println(mobilecompany());	}
	
	int priceofmobile()
	{
		int price = 30000;
		return price;
	}
	
	String mobilecompany()
	{
		String mobilecompany = "iqoo";
		return mobilecompany;
	}

}
