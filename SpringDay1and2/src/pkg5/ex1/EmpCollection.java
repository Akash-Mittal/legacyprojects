package pkg5.ex1;

import java.util.List;

public class EmpCollection {
	
List<Employee> empList;
public EmpCollection() {
System.out.println("Constructor");
}
public List<Employee> getEmpList() {
	return empList;
}

public void setEmpList(List<Employee> empList) {
	this.empList = empList;
}


}
