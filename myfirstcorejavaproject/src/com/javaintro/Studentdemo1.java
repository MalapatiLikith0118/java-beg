package com.javaintro;

public class Studentdemo1 {
	
	
	
	private Integer studentid;
	private String studentname;
	private char gender;
	private String studentbranch;
	private String collegename; 
	
	void studentdetails()
	{
		System.out.println(studentid);
		System.out.println(studentname);
		System.out.println(gender);
		System.out.println(studentbranch);
		System.out.println(collegename);
	}

	public static void main(String[] args) {
		
		Studentdemo1 s1 = new Studentdemo1();
		
		s1.studentid = 1001;
		s1.studentname = "likith";
		s1.gender = 'M';
		s1.studentbranch = "AI&DS";
		s1.collegename = " KL University";
		
		s1.studentdetails();
		
		
	}

}
