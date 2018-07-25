package com.pack.methodinjection.five;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class MyClient {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/pack/methodinjection/five/E5Bean.xml");
	Address add = (Address) context.getBean("add5");
	System.out.println(add);
	
	Employee emp = (Employee) context.getBean("emp5");
	System.out.println(emp);
	
}
}
