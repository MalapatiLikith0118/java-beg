package com.javaintro;

public class Teatliterals {

	public static void main(String[] args) {
		
		// integer literals
		System.out.println("int literals");

		// decimal literals
		int i1 = 1011;
		System.out.println(i1);
		
		// octal literals the are from 0-7 and start with 0
		int i2 = 067;
		System.out.println(i2);
		
		//hexadecimal from 0-9 start with ox and a-f or A-F
		int i3 = 0x97a89;
		System.out.println(i3);
		
		// decimal start with 0 and have only 0 and 1
		int i4 = 01010;
		System.out.println(i4);
		System.out.println("\n");
		
		// float literals
		System.out.println("flot literals");
		float f1 = 24;
		System.out.println(f1);
		
		// this is an int type start with 0x hexa, hexa->int->float
		float f2 = 0x3425;
		System.out.println(f2);
		
		
		// here d is also hexadecimal
		double f3 = 0x567d;
		System.out.println(f3);
		System.out.println("\n");

		
		// character literal
		System.out.println("char literals");
		char c1 = 'A';
		char c2 = 67;
		char c3 = 45;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println("\n");

		
		// string
		System.out.println("string literals");

		String s1 = "likith" ;
		System.out.println(s1);
		System.out.println("\n");

		
		// boolean true or false
		System.out.println("boolean literals");

				
		boolean b1 = true;
		if(b1)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
				
	}

}
