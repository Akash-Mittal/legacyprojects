package pkg5.ex1;

public class Employee {
	private String eid, name;
	private double salary;
		
	static int i=0;
	public Employee() {
		System.out.println(++i);
		}
	
	public Employee(String eid, String name,double salary) {
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
// If you create object of Address class with getter/setter method, It wont's work
