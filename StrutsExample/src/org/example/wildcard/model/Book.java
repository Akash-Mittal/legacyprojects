package org.example.wildcard.model;

public class Book {
private int bookId;
private String bookName;


public Book(int bookId, String bookName) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
}

	public Book() {
		bookId=-1;
		bookName=null;

	}
	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [bookId=");
		builder.append(bookId);
		builder.append(", bookName=");
		builder.append(bookName);
		builder.append("]");
		return builder.toString();
	}

}
