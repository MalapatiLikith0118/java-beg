package com.javaintro;

public class Movie1 {
	
	static String theatername = "sudharshan35mm";
	static String managername = "unknown";
	
	
	int movieid;
	String moviename;
	String heroname;
	int availableseats;
	int bookedseats;
	
	
	
	void displaymoviedetails()
	{
		System.out.println("movie id:"+movieid);
		System.out.println("movie name:"+moviename);
		System.out.println("heroname:"+heroname);
		System.out.println("availablesearts:"+availableseats);
	}
	
	void bookseats(int bookseats)
	{
		bookedseats = availableseats-bookseats;
		System.out.println("available seats: "+bookedseats);
	}
	
	void changemanagement(String newmanager)
	{
		managername = newmanager;
		System.out.println("the new manager is: "+ managername);
	}

	public static void main(String[] args) {
		
		System.out.println(theatername);
		System.out.println(managername);
		
		Movie1 m1 = new Movie1();
		Movie1 m2 = new Movie1();
		
		m1.movieid = 1001;
		m1.moviename = "varanasi";
		m1.heroname = "mahesh babu";
		m1.availableseats = 100;
		
		m2.movieid = 1002;
		m2.moviename = "spirit";
		m2.heroname = "prabhas";
		m2.availableseats = 80;
		
		m1.displaymoviedetails();
		m2.displaymoviedetails();
		
		m1.bookseats(47);
		m2.bookseats(38);
		
		m1.changemanagement("likith");
		
		
		
		
		
	}

}
