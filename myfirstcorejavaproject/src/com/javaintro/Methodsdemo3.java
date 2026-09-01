// with no return type with no parameter
// Instance variable shared by all methods below


package com.javaintro;

public class Methodsdemo3 {
	
	// Instance variable shared by all methods below
	int id;
	String name;
	long phno;
	
	
	void mydetails()
	{
	System.out.println("my id :"+ id);	
	System.out.println("my name :"+ name);	
	System.out.println("my pnone no: "+ phno);	

	}

	public static void main(String[] args) {
		
		
		Methodsdemo3 hi = new Methodsdemo3();
		
		hi.id = 1001;
		hi.name = "likith";
		hi.phno = 9441649333l;
		
		
		hi.mydetails();
		
	}
	
}
