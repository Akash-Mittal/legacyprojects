package com.pack.annotation.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception {
	ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/pack/annotation/aspectj/Bean.xml");
	BookStoreDao dao =   (BookStoreDao) context.getBean("daoBean");
	BookStoreBean myBookStore = (BookStoreBean) context.getBean("bookStoreBean");
	myBookStore.setBooksCapacity(4);
	myBookStore.setBookStoreID(4153);
	myBookStore.setLocation("Idaho");
	myBookStore.setName("Letz Read..");
	
	dao.adBookStore(myBookStore);
	dao.addBooksToBookStore(myBookStore, new BookBean("Springs in Action",18543,false));
	dao.addBooksToBookStore(myBookStore, new BookBean("Liferay in Action",12143,true));
	dao.addBooksToBookStore(myBookStore, new BookBean("Hibernate in Action",11143,false));
//	

	
	BookStoreBean hisBookStore = new BookStoreBean();
	hisBookStore.setBooksCapacity(5);
	hisBookStore.setBookStoreID(4154);
	hisBookStore.setLocation("Kentucky");
	hisBookStore.setName("Be Inquisitive..");
	
	dao.adBookStore(hisBookStore);
	dao.addBooksToBookStore(hisBookStore, new BookBean("JSF in Action",28543,false));
	dao.addBooksToBookStore(hisBookStore, new BookBean("SRUTS 2.0 in Action",32143,true));
	dao.addBooksToBookStore(hisBookStore, new BookBean("Castor in Action",41143,false));

	
	//	System.out.println(dao);
	
	}
	
}
