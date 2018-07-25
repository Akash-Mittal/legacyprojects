package com.pack.collectionInjection.five.one;

public class Employee {
	
	String fName;
	String lName;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	@Override
	public String toString() {
		return "Employee [fName=" + fName + ", lName=" + lName + "]";
	}

}
