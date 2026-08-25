package com.javaintro;

public class Testdemovariables {

	public static void main(String[] args) {
		
		// auto boxing
		
		int n = 100;
		Integer b1 = n ;
		
		System.out.println(b1);
		
		// auto un-boxing
		
		Integer b2 = 10;
		int b3 = b2;
		System.out.println(b3);
	}

}
