package com.javaintro;

import java.util.Scanner;

public class Constructordemo11 {
	
	String car_name;
	String color;
	double price;

	
	Constructordemo11()
	{
		System.out.println("from no arg");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter car name");
		car_name = sc.nextLine();
		
		System.out.println("enter car color");
		color = sc.nextLine();
		
		System.out.println("price");
		price = sc.nextDouble();
		
		sc.close();
	}
	
	void show()
	{
		System.out.println("your car name "+ car_name);
		
		System.out.println("car color"+ color);
		
		System.out.println("price"+ price);
	}

	public static void main(String[] args) {
		
		Constructordemo11 q1 = new Constructordemo11();
		
		q1.show();
		
	}

}
