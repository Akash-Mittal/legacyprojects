package pkg11.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {

	public static void main(String[] args) {
		try{
	ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:pkg11/resource/beans.xml");
	Employee emp1=(Employee)ctx.getBean("emp");
	System.out.println(emp1);
	}
	catch(Exception ex){
		System.out.println("Error Occurred");
		System.out.println("Error Occurred");
	}
}
}
