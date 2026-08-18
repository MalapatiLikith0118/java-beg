package com.javaintro;

public class Cricketer {
	
	static int countryid = 91;
	static String countryname = "india";
	
	int jersyno;
	String name;
	int runs;


	public static void main(String[] args) {
		
		System.out.println("Welcome to cricket team");
		
		System.out.println(countryid);
		System.out.println(countryname);
		
		
		System.out.println("*******details********");
		
		Cricketer likith = new Cricketer();
		likith.jersyno=01;
		likith.name="likith";
		likith.runs = 1180;
		System.out.println("jersy number"+likith.jersyno);
		System.out.println("Player name"+likith.name);
		System.out.println("Player runs"+likith.runs);
		
		System.out.println("*******details********");
		
		Cricketer sathvik = new Cricketer();
		sathvik.jersyno = 28;
		sathvik.name="sathvik";
		sathvik.runs = 2000;
		System.out.println("jersy number"+sathvik.jersyno);
		System.out.println("Player name"+sathvik.name);
		System.out.println("Player runs"+sathvik.runs);
		
	}

}
