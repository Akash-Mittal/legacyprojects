package pkg11.resource;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class Employee {
	private String eid, name;
	private double salary;
	private Address address;

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	@Resource(name = "add")
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {

		return eid + "\t" + name + "\t" + salary + "\t" + address;
	}
}
