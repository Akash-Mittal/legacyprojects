package com.pack.annotation.aspectj;

import java.util.List;

import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class BookBean {
	public BookBean(String bookName, Integer bookId, Boolean featured) {
		super();
		this.bookName = bookName;
		this.bookId = bookId;
		this.featured = featured;
	}
	private String bookName;
	private Integer bookId;
	private Boolean featured;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public Boolean getFeatured() {
		return featured;
	}
	public void setFeatured(Boolean featured) {
		this.featured = featured;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BookBean [bookName=");
		builder.append(bookName);
		builder.append(", bookId=");
		builder.append(bookId);
		builder.append(", featured=");
		builder.append(featured);
		builder.append("]");
		return builder.toString();
	}
	
	public BookBean() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		List<BookBean> books = session.createQuery("from BookBean").list();
		session.close();
		System.out.println(books);
	}
	

}
