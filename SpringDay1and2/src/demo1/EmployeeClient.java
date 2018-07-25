package demo1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {

	public static void main(String[] args) 
	{
		//BeanFactory factory = new ClassPathXmlApplicationContext("beans1.xml");
		ApplicationContext factory=new ClassPathXmlApplicationContext("classpath:demo1/beans1.xml");
		EmployeeInterface empint=(EmployeeInterface)factory.getBean("emp");
		System.out.println(empint.getEmp());

	}

}
