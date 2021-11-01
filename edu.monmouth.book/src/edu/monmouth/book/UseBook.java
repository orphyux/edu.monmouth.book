package edu.monmouth.book;
//Creates the book objects and validates the exception logic is correctly coded 

public class UseBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = null;
		Book b2 = null;
		Book b3 = null;
		Book b4 = null;
		Book b5 = null;
		
		//TODO make their own try blocks. 
		try {
		 b1 = new Book(90, 8.99,"Lord of the Flies", BookTypes.HARDBACK);
		 System.out.println(b1);
		} catch(BookException e) {
		 System.err.println(e.getMessage());
		}
		
		try {
			 b2 = new Book(287,15.40,null, BookTypes.SOFTBACK );
			 System.out.println(b2);
			} catch(BookException e1) {
			 System.err.println(e1.getMessage());
			}
		try {
			 b3 = new Book(0, 9.99, "Gone With The Wind", BookTypes.ELECTRONIC);
				System.out.println(b3);
			} catch(BookException e2) {
			 System.err.println(e2.getMessage());
			}
		try {
			 b4 = new Book(100,  19.99, "Hounds of Baskerville",BookTypes.SOFTBACK);
				System.out.println(b4);	
			} catch(BookException e3) {
			 System.err.println(e3.getMessage());
			}
				
		try {
			 b5 = new Book(200, 29.99, "Vampire Hunter", BookTypes.HARDBACK);
				System.out.println(b5);
			} catch(BookException e5) {
			 System.err.println(e5.getMessage());
			}
			
		
		try {
		 b1.setNumberOfPages(-9);
		} catch(BookException e) {
		 System.err.println(e.getMessage());
		}
		
		try {
			b4.setPrice(-4.00);
			System.out.println("new price " + b4);
		}catch(BookException ePrice) {
			System.err.println(ePrice.getMessage());
		}
		try {
			b5.setTitle(null);
			System.out.println("New title "+ b5);
		}catch(BookException eTitle) {
			System.err.println(eTitle.getMessage());
		}

	}

}

//it still didn't error out! why? 
//test push
