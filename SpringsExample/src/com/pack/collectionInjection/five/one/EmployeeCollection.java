package com.pack.collectionInjection.five.one;

import java.util.List;

public class EmployeeCollection {
	List<Employee> emplist ;

	public List<Employee> getEmplist() {
		return emplist;
	}

	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}

	@Override
	public String toString() {
		return "EmployeeCollection [emplist=" + emplist + "]";
	}
	
	

}
