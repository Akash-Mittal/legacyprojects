package com.pack.staticInjection.six;

public class Employee {
private String eName;
private String eId;

public static Employee emp = new Employee();
public Employee() {
	// TODO Auto-generated constructor stub
}


public static Employee getEmployee(){
	return emp;
}


public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
public String geteId() {
	return eId;
}
public void seteId(String eId) {
	this.eId = eId;
}
@Override
public String toString() {
	return "Employee [eName=" + eName + ", eId=" + eId + "]";
}
	
}
