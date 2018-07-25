package pkg11.configurationbean;

public class EmployeeServiceImpl implements EmployeeService {
	Employee emp = new Employee();

	@Override
	public void setEmployee(Employee emp) {
		this.emp = emp;
	}

	@Override
	public Employee getEmployee() {
		return emp;
	}

}
