package com.pack.annotations.confandbean;

public class Employee {
private String eName;

public Employee() {
	// TODO Auto-generated constructor stub
}

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

@Override
public String toString() {
	return "Employee [eName=" + eName + "]";
}
	
	
}
