package com.pack.annotation.aspectj;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AdminTrack {

@Pointcut(" execution(* com.pack.annotation.aspectj.BookStoreDao.addBooksToBookStore(..))")
public void notifyAdmin(){}

@AfterReturning("notifyAdmin()")
public void sendMail(JoinPoint jp){
	BookStoreDao dao = (BookStoreDao) jp.getTarget();
	List<BookStoreBean> bookstores = dao.getBookstores(); 
	for(BookStoreBean x : bookstores){
		List<BookBean> books = x.getBooks();
			for(BookBean y : books){
					//if(y.getFeatured())
						System.out.println(y.getBookName()+"    a Featured in BookStore"+x.getName());
			}
	}
	System.out.println(dao);

}

@AfterThrowing(pointcut="execution(* com.pack.annotation.aspectj.BookStoreDao.addBooksToBookStore(..))",throwing="ex")
public void addSpaceToBookStore(JoinPoint jp , Exception ex){
	System.out.println("Sending Mail ....\nPlease Increase the Shelf Area in ...");
	System.out.println(jp.getSignature());
	ex.printStackTrace();
}

//@Around("execution(* *.addBooksToBookStore(..))")
//public Object featuredBook(ProceedingJoinPoint pjp) throws Throwable{

//}

	
}
