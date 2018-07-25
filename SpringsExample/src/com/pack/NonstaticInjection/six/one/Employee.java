package com.pack.NonstaticInjection.six.one;

public class Employee {
	private int eId;
	private String eName;
	private static Employee emp = new Employee(); 
	
	public Employee(int eId, String eName) {
		super();
		this.eId = eId;
		this.eName = eName;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee getEmployee(){
		return Employee.emp;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public static Employee getEmp() {
		return emp;
	}

	public static void setEmp(Employee emp) {
		Employee.emp = emp;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + "]";
	}
	
	
}
