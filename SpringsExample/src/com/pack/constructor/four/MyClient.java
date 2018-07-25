package com.pack.constructor.four;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClient {
	

public static void main(String[] args) {
	// Using Constructor
	// Using Constructor with Object
	// Constructor Ambiguity emp4.1

	ApplicationContext context = new ClassPathXmlApplicationContext
			("classpath:com/pack/constructor/four/E4Bean.xml");
	
	Employee emp = (Employee) context.getBean("emp4");
	System.out.println(emp);
	
	emp = (Employee) context.getBean("emp4.1");
	System.out.println(emp);

	// Using Multiple Beans XML
	String xmlBean[] = new String[]{"classpath:com/pack/constructor/four/E4Bean.xml","classpath:com/pack/three/E3bean.xml"};
	context = new ClassPathXmlApplicationContext(xmlBean);

	emp = (Employee) context.getBean("emp4");
	System.out.println(emp);

	com.pack.three.Employee emp3 = (com.pack.three.Employee) context.getBean("emp3");
	System.out.println(emp3);

	
}
	
}
