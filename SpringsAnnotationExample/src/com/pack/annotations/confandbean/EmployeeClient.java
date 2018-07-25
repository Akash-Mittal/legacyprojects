package com.pack.annotations.confandbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeClient {
	public static void main(String[] args) {
		EmployeeService emp = new EmployeeServiceImpl();
		emp.setEmployee(new Employee("Akash"));
		System.out.println(emp.getEmployee());
		
		
		EmployeeService emp1 = EmployeeBean.empService();
		emp1.setEmployee(new Employee("Akash1"));
		System.out.println(emp1.getEmployee());
		
		
		Employee emp2 = new Employee("Akash2");
		System.out.println(emp2);
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeBean.class);
		EmployeeService empservice = context.getBean(EmployeeService.class);
		empservice.setEmployee(new Employee("Akash3"));
		System.out.println(empservice.getEmployee());
		
		
		
	}

}
