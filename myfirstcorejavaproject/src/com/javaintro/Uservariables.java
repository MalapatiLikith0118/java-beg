package com.javaintro;


class user{
	String name;
	int empid;
	company cmpanyname;
}

class company{
	String name;
	String city;
	String state;
	
}




public class Uservariables {
	
	
	void showdetails()
	{
		
	}

	public static void main(String[] args) {
		
		user u1 = new user();
		u1.name = "likith";
		u1.empid = 123;
		u1.cmpanyname = new company();
		u1.cmpanyname.name = "known";
		u1.cmpanyname.city = "blr";
		u1.cmpanyname.state = "KA";
		
		
		System.out.println(u1.name);
		System.out.println(u1.empid);
		System.out.println(u1.cmpanyname);
		System.out.println(u1.cmpanyname.name);
		System.out.println(u1.cmpanyname.city);
		System.out.println(u1.cmpanyname.state);
		
		
	}

}
