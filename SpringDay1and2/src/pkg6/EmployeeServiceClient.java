package pkg6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pkg5.CollectionBean;

public class EmployeeServiceClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:pkg6/beans.xml");
		EmployeeService empservice=(EmployeeService)context.getBean("empservice");
		System.out.println(empservice);
	}

}
