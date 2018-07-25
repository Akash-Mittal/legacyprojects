package pkg3.ex1;

public class Employee {
	private String eid, name;
	private double salary;
	private Address address;
public Employee() {

}

	public Employee(String eid, String name, double salary, Address address) {
	super();
	this.eid = eid;
	this.name = name;
	this.salary = salary;
	this.address = address;
}

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

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {

		return eid + "\t" + name + "\t" + salary;
	}
}
