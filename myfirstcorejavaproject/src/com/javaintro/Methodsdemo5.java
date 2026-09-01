package com.javaintro;

import java.util.Scanner;

public class Methodsdemo5 {
	
	
	
	void method()
	{
		Scanner s1 = new Scanner(System.in);

//		String empname;
//		int id;
		
		System.out.println("enter name");
		String empname1 = s1.next();
		
		
		System.out.println("enter id");
		int id1 = s1.nextInt();
		
		System.out.println("employee name is: "+ empname1);
		System.out.println("employee id is : "+ id1);
	}

	public static void main(String[] args) {
		
		Methodsdemo5 m1 = new Methodsdemo5();
		m1.method();
;	
		
	}

}
