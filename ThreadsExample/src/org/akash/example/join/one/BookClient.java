package org.akash.example.join.one;

import java.util.ArrayList;
import java.util.Vector;



public class BookClient  extends Thread{
	
	 static Vector<Book> books = new Vector<Book>();
	
	public BookClient(Book book) {
		books.add(book);
	}
	
	@Override
	public void run() {
		System.out.println(this.getName()+" : Total Number of books :"+books.size());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) throws Exception {
	Thread t1 = 	new Thread(new BookClient(new Book("Liferay in Action", "Michael Chintahp")));
	Thread t2 = 	new Thread(new BookClient(new Book("Springs in Action", "Michael Shauefiled")));
	Thread t3 = 	new Thread(new BookClient(new Book("Struts in Action", "Laul Enouv")));
	Thread t4 = 	new Thread(new BookClient(new Book("Hibernate in Action", "Sarah Jesica Parker")));
	t1.start();t2.start();t3.start();t4.start();
	t1.join();
	t2.join();
	t3.join();
	t4.join();
	
	
	for(Book book : books )
			System.out.println(book);
	}
	
}
