package pkg3.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {

	public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:pkg3/ex1/beans.xml");
	Employee emp1=(Employee)ctx.getBean("emp");
	Address address=emp1.getAddress();
	System.out.println(emp1);
	System.out.println(address);
	
	}

}
