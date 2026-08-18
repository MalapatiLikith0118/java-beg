package com.javaintro;

public class movie {
	
	// variable declaration
	
	String moviename;
	int release_year;
	double ticket_price;
	
	
	void display()
	{
		System.out.println("movie name:"+ moviename);
		System.err.println("movie release year:"+ release_year);
		System.err.println("ticket price:"+ticket_price);
	}
	
	public static void main(String[] args) {
		
		//creating objects
		movie m1 = new movie();
		movie m2 = new movie();
		movie m3 = new movie();
		
		m1.moviename = "varanasi";
		m1.release_year = 2027;
		m1.ticket_price = 1000;
		
		m2.moviename = "DC";
		m2.release_year = 2026;
		m2.ticket_price = 500;
		
		m3.moviename = "dhrundhar";
		m3.release_year = 2026;
		m3.ticket_price = 800;
		
		
		System.out.println("----------movies on the list----------");
		m1.display();
		m2.display();
		m3.display();
		
		
	}

}
