package com.pack.NonstaticInjection.six.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class MyClient {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/pack/NonstaticInjection/six/one/E6.1Bean.xml");
	
	Employee emp = (Employee) context.getBean("emp6.1");
	System.out.println(emp);
	
	
}
}
