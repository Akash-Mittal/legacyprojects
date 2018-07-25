package pkg7.ex1;


public class Employee {

	private String eid, name;
	private double salary;
	

	public Employee() {
		eid="A004";
		name="sks";
		salary=444.00d;
		
	}

	public Address getAddress() {
		return new Address();
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

	@Override
	public String toString() {

		return eid + "\t" + name + "\t" + salary + "\t" ;
	}
}
