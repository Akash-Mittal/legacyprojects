package com.pack.annotations.confandbean;

public class EmployeeServiceImpl implements EmployeeService {
Employee emp = new Employee();	
	
	@Override
	public Employee getEmployee() {
		return this.emp;
	}

	

	@Override
	public void setEmployee(Employee emp) {
	  this.emp = emp;
		
	}
	

}
