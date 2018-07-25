package pkg11.configurationbean;


public class Employee {
	private String eid, name;
	private double salary;
	public Employee() {
	}
	
	
	public Employee(String eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
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

		return eid + "\t" + name + "\t" + salary+"\t";
	}
}
