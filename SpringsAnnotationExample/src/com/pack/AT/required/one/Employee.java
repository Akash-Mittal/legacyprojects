package com.pack.AT.required.one;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employee {
	
	private String eName;
	
	
	public String geteName() {
		return eName;
	}
	@Required
	public void seteName(String eName) {
		this.eName = eName;
	}
		public String toString() {
			return "Employee [eName=" + eName + "]";
		}
	
		public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("com/pack/AT/required/one/ATE1Bean.xml");
			Employee emp = (Employee) context.getBean("emp1");
			System.out.println(emp);
		}
	
}
