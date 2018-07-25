package pkg11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {

	public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:pkg11/beans.xml");
	Employee emp1=(Employee)ctx.getBean("emp");
	System.out.println(emp1);
	}

}
