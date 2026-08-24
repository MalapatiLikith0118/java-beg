package com.javaintro;

public class Studentdetails {
	
	String student_name = "likith";
	int age = 21;
	int admissionyear = 2023;
	long rollnumber = 2310080070l;
	long mobilenuberl = 9441649333l;
	float atendancepercentage = 86.45f;
	int toatalfees = 270000;
	char grade = 'A';
	String pass_fail = "Pass";
	int fee_paid = 200000;
	

	public static void main(String[] args) {
		
		Studentdetails s1 = new Studentdetails();
		
		System.out.println(s1.student_name);
		System.out.println(s1.age);
		System.out.println(s1.admissionyear);
		System.out.println(s1.rollnumber);
		System.out.println(s1.mobilenuberl);
		System.out.println(s1.atendancepercentage);
		System.out.println(s1.toatalfees);
		System.out.println(s1.grade);
		System.out.println(s1.pass_fail);
		System.out.println(s1.fee_paid);

	}

}
