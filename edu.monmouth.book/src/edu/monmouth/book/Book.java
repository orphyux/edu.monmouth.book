package edu.monmouth.book;


public class Book {
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

	

}
