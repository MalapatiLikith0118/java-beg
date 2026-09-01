// with return type no parameters
package com.javaintro;

public class Methodsdemo10 {

	public static void main(String[] args) {
		
		Methodsdemo10 q1 = new Methodsdemo10();
		
		System.out.println(q1.withdraw());
		q1.withdraw();
		
	}
	
	float withdraw()
	{
		float balance = 2345.0f;
		return balance;
	}

}
