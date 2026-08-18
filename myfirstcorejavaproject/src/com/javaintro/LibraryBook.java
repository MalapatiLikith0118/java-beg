package com.javaintro;

public class LibraryBook {
	
	// variable declaration
	
	int bookid ;
	String booktitle;
	String authername;
	int available_copies;
	String libraryname;
	String librarianname;
	
	//methods declaration
	
	void displaybookdetails() {
		System.out.println("book id:"+ bookid);
		System.out.println("book title:"+ booktitle);
		System.out.println("auther name:"+authername);
		System.out.println("avaible copies:"+available_copies);
		
	}
	
	// method 2 declaration
	
	void dislaylibrarydetails() {
		System.out.println("library name:"+libraryname);
		System.out.println("librarian name:"+librarianname);
		
	}
	
	// method 3 declaration
	
	void changelibraryname(String newlibrarianname) {
		librarianname=newlibrarianname;
	}

	public static void main(String[] args) {
		
		// creating an objects
		
		LibraryBook book1 = new LibraryBook();
		LibraryBook book2 = new LibraryBook();
		
		// assigning values
		
		book1.bookid = 10;
		book1.booktitle = "code with java";
		book1.authername = "Unknown";
		book1.available_copies = 10;
		book1.libraryname = "open";
		book1.librarianname = "unknown";
		
		
		book2.bookid = 11;
		book2.booktitle = "simple by java";
		book2.authername = "srikanth";
		book2.available_copies = 10;
		book2.libraryname = "centeral";
		book2.librarianname = "unknown";
		
		
		// to display
		
		System.out.println("----------details of the book1----------");
		book1.dislaylibrarydetails();
		book1.displaybookdetails();
		
		System.out.println("----------details of the book1----------");
		book2.dislaylibrarydetails();
		book2.displaybookdetails();

		// change librarian name
		
		//book1.changelibraryname("known");
		
	}

}
