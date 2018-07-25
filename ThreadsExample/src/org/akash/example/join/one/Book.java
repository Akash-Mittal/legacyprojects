package org.akash.example.join.one;

public class Book  {
String bookName;
String bookAuthor;

public Book(String bookName, String bookAuthor) {
	this.bookName = bookName;
	this.bookAuthor = bookAuthor;

}
public Book() {
	this.bookName="Default Book";
this.bookAuthor="Default Author";
	
}
public String getBookName() {
	return bookName;
}


public void setBookName(String bookName) {
	this.bookName = bookName;
}


public String getBookAuthor() {
	return bookAuthor;
}


public void setBookAuthor(String bookAuthor) {
	this.bookAuthor = bookAuthor;
}




@Override
public String toString() {
	return "Book [bookName=" + bookName + ", bookAuthor=" + bookAuthor + "]";
}
	
	
}
