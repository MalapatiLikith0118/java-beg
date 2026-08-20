package com.javaintro;

public class Example {
	
	
	// instance variables
	String name = "likith";
	int age = 21;
	long phno = 9441649333l;
	String hobby = "burning time";
	
	// instance methods
	
	void name(){
		System.out.println("name is :"+ name);
	}
	
	void age() {
		System.out.println("age is :"+ age);
	}
	
	void phone(){
		System.out.println("phone number :"+phno);
	}
	
	void hobby(){
		System.out.println("hobby: "+hobby);
	}
	
	
	static {
		Example e1 = new Example(); 
		e1.name();
		e1.age();
		e1.phone();
		e1.hobby();
	}

	public static void main(String[] args) {
		
		
		
		
	}

}
