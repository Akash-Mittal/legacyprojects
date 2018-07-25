package pkg3.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {

	public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:pkg3/ex2/beans.xml");
	Employee emp1=(Employee)ctx.getBean("emp1");
	System.out.println(emp1);
	emp1=(Employee)ctx.getBean("emp2");
	System.out.println(emp1);
	}

}
