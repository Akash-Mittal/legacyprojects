package com.pack.annotation.aspectj;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BookStoreBean {
	private List<BookBean> books;
	private Integer bookStoreID;
	private String name;
	private String location;
	private Integer booksCapacity;
	
	public BookStoreBean() {
	this.books= new ArrayList<BookBean>();
	this.booksCapacity=0;
	this.bookStoreID=0;
	this.location="default";
	this.name="default";
	}
	
	
	public List<BookBean> getBooks() {
		return books;
	}
	public void setBooks(List<BookBean> books) {
		this.books = books;
	}
	public Integer getBookStoreID() {
		return bookStoreID;
	}
	public void setBookStoreID(Integer bookStoreID) {
		this.bookStoreID = bookStoreID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "BookStoreBean [books=" + books + ", bookStoreID=" + bookStoreID
				+ ", name=" + name + ", location=" + location
				+ ", booksCapacity=" + booksCapacity + "]";
	}
	public Integer getBooksCapacity() {
		return booksCapacity;
	}
	public void setBooksCapacity(Integer booksCapacity) {
		this.booksCapacity = booksCapacity;
	}

	
	
	
}
