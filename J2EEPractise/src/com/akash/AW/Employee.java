package com.akash.AW;

import java.util.LinkedList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Employee {
	private String employeeName;
	private List<Address> address = new LinkedList<Address>() ;
	public Employee(String employeeName, List<Address> address) {
		super();
		this.employeeName = employeeName;
		this.address = address;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", address="
				+ address + "]";
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public static void main(String[] args){
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("classpath:com/akash/AW/bean.xml");
		System.out.println((Address) context.getBean("address"));	
		Employee employee = (Employee) context.getBean("emp");
		System.out.println(employee);
	}
}
