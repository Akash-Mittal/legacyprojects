package pkg11.configurationbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeClient {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(EmployeeBean.class);
EmployeeService empservice=ctx.getBean(EmployeeService.class);
Employee emp=new Employee("A002","Subodh",444.88d);
empservice.setEmployee(emp);
Employee emp1=empservice.getEmployee();
System.out.println(emp1);
	}

}
