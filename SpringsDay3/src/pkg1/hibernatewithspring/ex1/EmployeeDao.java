package pkg1.hibernatewithspring.ex1;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class EmployeeDao extends HibernateDaoSupport {
	
	public void addEmployee(String code, String name, String city, double salary) {
		Employee emp = new Employee(code, name, city, salary);
		getHibernateTemplate().save(emp);
	}

	public void updateSalary(String code, double salary) {
		Employee emp = getHibernateTemplate().get(Employee.class, code);
		if (emp != null) {
			emp.setSalary(emp.getSalary() + salary);
		}
		getHibernateTemplate().update(emp);
	}

	public void deleteSalary(String code) {
		Employee emp = getHibernateTemplate().get(Employee.class, code);
		if (emp != null) {
			getHibernateTemplate().delete(emp);
		}

	}

	public Employee queryEmployee(String code)
	{
		Employee emp=null;
		emp = getHibernateTemplate().get(Employee.class, code);
		return emp;
	}
	public List<Employee> getAllEmployees() {
		return getHibernateTemplate().find("from Employee");
	}
	
}
