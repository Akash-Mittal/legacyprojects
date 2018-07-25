package com.pack.staticInjection.six;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClient {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/pack/staticInjection/six/E6Bean.xml");
		Employee emp = (Employee) context.getBean("emp6");
		emp.seteId("1213");
		emp.seteName("Akash");
		System.out.println(emp);
		
		
	}

}
