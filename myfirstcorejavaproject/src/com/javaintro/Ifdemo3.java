package com.javaintro;

import java.util.Scanner;

public class Ifdemo3 {

	public static void main(String[] args) {
// attendance
		
		System.out.println("mnain method started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your attendence");
		double att = sc.nextDouble();
		sc.close();
		
		if (att>=80)
		{
			System.out.println("eligible for exams");
		}
		else
		{
			System.out.println("good bye");
		}
	}

}
