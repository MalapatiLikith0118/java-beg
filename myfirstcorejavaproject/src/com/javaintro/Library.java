package com.javaintro;

public class Library {
	
	static String libraryname = "Unknown";
	String librarianname = "person";
	
	int bookid;
	String booktitle;
	String authorname;
	int availablecopies;
	String newlibrarianname;
	
	void displaybooks()
	{
		System.out.println("book id: "+ bookid);
		System.out.println("book title: "+ booktitle);
		System.out.println("authorname is : "+ authorname);
		System.out.println("available copies\n: "+ availablecopies);
	}
	
	void issuebook(int issued)
	{
         System.out.println("---------------------");
		 int finalcount = availablecopies-issued;
		 System.out.println("available ofter giving:"+finalcount);
	}
	
	
	
	void displaylibrarydetails()
	{
		System.out.println(libraryname);
	}
	
	
	
	void changelibrarian(String newlibrarianname)
	{
		librarianname = newlibrarianname;
		System.out.println(librarianname);
	}
	

	public static void main(String[] args) {
		
		Library l1 = new Library();
		Library l2 = new Library();
		
		
		l1.displaylibrarydetails();
		
		l1.bookid = 1001;
		l1.booktitle = "java is simple";
		l1.authorname = "by java developer";
		l1.availablecopies = 10;
		l1.changelibrarian("ki");
		
	
		
		l2.bookid = 1002;
		l2.booktitle = "python is simple";
		l2.authorname = "by python developer";
		l2.availablecopies = 5;
		
		l1.displaybooks();
		l2.displaybooks();
		
		
	    l1.newlibrarianname = "likith";
		l1.issuebook(2);
		
		l2.issuebook(4);
		
		

	}
	

}
