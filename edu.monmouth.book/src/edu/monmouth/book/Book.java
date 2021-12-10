package edu.monmouth.book;


public class Book implements Comparable<Book> {
	//Class Variables
	private int numberOfPages;
	private BookTypes bookType;
	private String title;
	private double price;
	
	public Book () {}
	//Creates a Book using the setter methods with exception logic. 
	public Book(int numberOfPages,double price, String title, BookTypes bookType) throws BookException {
		setTitle(title);
		setNumberOfPages(numberOfPages);
		setPrice(price);
		setBookType(bookType);
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}


	public void setNumberOfPages(int inNumberOfPages) throws BookException{
		numberOfPages = inNumberOfPages;
		if (numberOfPages < BookConstants.MINPAGES) {   
			final String MESSAGE = "Please enter a page length greater than 0";
			throw new BookException(MESSAGE);
		}
		else {this.numberOfPages = inNumberOfPages;}
	}


	public BookTypes getBookType() {
		return bookType;
	}


	public void setBookType(BookTypes bookType) throws BookException {
		this.bookType = bookType;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String inTitle) throws BookException {
		//title = inTitle;
		if (inTitle == null || inTitle.isEmpty()) {
			final String MESSAGE = "Please Provide a Title";
			throw new BookException(MESSAGE);
		}
		else {
			this.title = inTitle;
		}
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double inPrice) throws BookException {
		if (price < BookConstants.MINPRICE) {
			final String MESSAGE = "The price of a book cannot be a negative number.  Please enter a value of 0 or above";
			throw new BookException(MESSAGE);
		}
		else {this.price = price;}
	}
	
	@Override
	public String toString() {
		return "Book [numberOfPages= " + numberOfPages + ", bookType= " + bookType + ", title= " + title + ", price= "
				+ price + "]";
	}

	//added for assignment 6
	@Override
	public boolean equals(Object o) {
		System.out.println("In Book equals...");
		if (o == null) {
			return false;
			}
		if (!(o instanceof Book)) {
			return false;
			}
		if (o == this) {
			return true;
			}
		Book otherBook = (Book)o;
		return otherBook.numberOfPages==numberOfPages &&
				otherBook.price==price &&
				otherBook.bookType==bookType &&
				otherBook.title.equals(title);
		}
	
	@Override
	public int compareTo(Book otherBook) {
		final int BEFORE = -1;
		final int EQUAL = 0;
		final int AFTER = 1;
		if (this == otherBook) {
			return EQUAL;
			}
		System.out.println("In Book's compareTo");
		if (this.numberOfPages < otherBook.numberOfPages) {
			return BEFORE;
			}
		if (this.numberOfPages > otherBook.numberOfPages) {
			return AFTER;
			}
		if (this.price < otherBook.price) {
			return BEFORE;
		}
		if (this.price > otherBook.price) {
			return AFTER;
		}
		return this.title.compareTo(otherBook.title);
		}

}//class
