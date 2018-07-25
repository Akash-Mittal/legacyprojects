package com.pack.AT.autowire.two;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookStore {
	@Autowired
	@Qualifier("bookbean1")
	private Book books;
	private String name;
	private String location;
	
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/pack/AT/autowire/two/ATE2Bean.xml");
		BookStore books = (BookStore) context.getBean("bookstorebean");
		System.out.println(books);

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
		return "BookStore [books=" + books + ", name=" + name + ", location="
				+ location + "]";
	}




	public Book getBooks() {
		return books;
	}




	public void setBooks(Book books) {
		this.books = books;
	}


}
