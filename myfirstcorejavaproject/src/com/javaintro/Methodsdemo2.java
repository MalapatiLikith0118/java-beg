// with no return type with parameter
package com.javaintro;

public class Methodsdemo2 {
	
	void method()
	{
		System.out.println("from instance method ");
	}
	
	public static void main(String[] args) {
		
		
		Methodsdemo2 hi = new Methodsdemo2();
		
		hi.method();
		
	}

}
