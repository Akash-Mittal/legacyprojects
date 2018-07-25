package pkg2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {

	public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:pkg2/beans.xml");
	Employee emp1=(Employee)ctx.getBean("emp");
	System.out.println(emp1);
	// set value programatically
	emp1.setEid("A001");
	emp1.setName("Ram Kumar");
	emp1.setCity("Kolkata");
	emp1.setSalary(455555.00d);
	System.out.println(emp1);
	
	}

}
