package com.javaintro;

import java.util.Scanner;

public class SwitchNesteddemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter 1 for veg and 2 for non veg");
		int iteam = sc.nextInt();
		
		
		switch(iteam) 
		{
		case 1:
			System.out.println("available dishes");
			System.out.println("1. Paneer biriyani     - ₹220/-");
            System.out.println("2. Veg Biryani              - ₹180/-");
            System.out.println("3. Mushroom biriyani        - ₹250/-");
            
            
            System.out.println("\n enter number for selected dish");
            int selectdishveg = sc.nextInt();
            
            switch(selectdishveg)
            {
            case 1 :
            	System.out.println("selected iteam panner biriyani");
            	System.out.println("cost 220/-");
            	break;
            	
            case 2:
 			   System.out.println("selected iteam veg biriyani");
 			   System.out.println("cost 180/-");
 			   break;
 			   
 			   
            case 3:
            	System.out.println("selected dish is mushroom biriyani");
            	System.out.println("cost 250/-");
            	break;
            	
            	default:
            		System.out.println("selected iteam not in list");
            }
            
            
            
		case 2:
			System.out.println("available dishes");
			System.out.println("1. chicken Butter Masala     - ₹320/-");
            System.out.println("2. chicken Biryani              - ₹280/-");
            System.out.println("3. mutton biriyani        - ₹350/-");
            
            
            System.err.println("select number to add iteams");
            int nvgiteam = sc.nextInt();
            
            switch(nvgiteam)
            {
            case 1 :
            	System.out.println("selected iteam chicken butter masal");
            	System.out.println("cost 320/-");
            	break;
            	
            case 2:
 			   System.out.println("selected iteam chicken biriyani");
 			   System.out.println("cost 280/-");
 			   break;
 			   
 			   
            case 3:
            	System.out.println("selected dish is mutton biriyani");
            	System.out.println("cost 350/-");
            	break;
            	
            	default:
            		System.out.println("selected iteam not in list");
            		break;
            }
			
            
		   
			   
		}
		
			
		sc.close();
	}

}
