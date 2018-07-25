package com.akash.hibernate;

import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class TechmEmployee {
	private Integer employeeId;
	private String employeeName;
	private Float employeeSalary;
	private Integer managerId;
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Float getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(Float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	@Override
	public String toString() {
		return "TechmEmployee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", employeeSalary=" + employeeSalary
				+ ", managerId=" + managerId + "]";
	}
	
	
	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		session.beginTransaction().begin();
		session.getTransaction().commit();
		
	}
	
	
}
