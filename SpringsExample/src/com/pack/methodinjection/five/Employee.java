package com.pack.methodinjection.five;

public abstract class Employee {
	private String eName;
	public abstract Address getAddress();
	@Override
	public String toString() {
		return "Employee [eName=" + eName + "]";
	}
	Employee(){}
	
	public Employee(String eName) {
		super();
		this.eName = eName;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	
}
