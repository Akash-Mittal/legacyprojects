package com.pack.three;

public class Employee {
	private String Name;
	private int empid;
	private Address address;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", empid=" + empid + ", address="
				+ address + "]";
	}
	

}
