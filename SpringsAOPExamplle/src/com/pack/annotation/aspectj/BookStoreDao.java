package com.pack.annotation.aspectj;

import java.util.ArrayList;
import java.util.List;

public class BookStoreDao {
	List <BookStoreBean> bookstores = new ArrayList<BookStoreBean>();
	public void adBookStore(BookStoreBean bookStore){
		bookstores.add(bookStore);
	}
	public void addBooksToBookStore(BookStoreBean bookStore,BookBean book) throws Exception{
		List <BookBean> books = bookStore.getBooks();
//		if(books.size()<1)
//			System.out.println("Adding first book");
		
		if(bookStore.getBooksCapacity()<books.size())
		{
			throw new Exception("Out of Capacity");
		}
		
		
//		if(book.getFeatured()){
//			System.out.println("Sending Mail to website admin for "+book.getBookName());
//		}
		
		books.add(book);
		bookStore.setBooks(books);
	}
	public List<BookStoreBean> getBookstores() {
		return bookstores;
	}
	@Override
	public String toString() {
		return "BookStoreDao [bookstores=" + bookstores + "]";
	}
}
