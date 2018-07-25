package com.pack.constructor.four;

public class Employee {
private String name;
private int empid;
private Address address;

Employee(){
	
}

public Employee(String name, int empid, Address address) {
	super();
	this.name = name;
	this.empid = empid;
	this.address = address;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", empid=" + empid + ", address="
			+ address + "]";
}

}
