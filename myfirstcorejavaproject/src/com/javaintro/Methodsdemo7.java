// with no return type with parameter
package com.javaintro;

import java.util.Scanner;

public class Methodsdemo7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Methodsdemo7 q1 = new Methodsdemo7();
		
		System.out.println("enter name");
		String name = sc.nextLine();
		
		System.out.println("enter age");
		int age = sc.nextInt();
		
		System.out.println("enter height");
		float height = sc.nextFloat();
		
		q1.print(name, age, height);
		
		sc.close();

	}
	
	void print(String name, int age, float height)
	{
	System.out.println("name is "+ name);
	System.out.println(" age is"+ age);
	System.out.println("height is "+height);
	}

}
