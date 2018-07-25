package pkg1.jdbc.namedtemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import pkg1.jdbc.jdbctemplate.Employee;

public class EmployeeNamedDao {
	NamedParameterJdbcTemplate namedTemplate;

	public void setNamedTemplate(NamedParameterJdbcTemplate namedTemplate) {
		this.namedTemplate = namedTemplate;
	}

	public void addEmployee(String code, String name, String city, double salary) {
		String sql = "insert into emp values(:code,:name,:city,:salary)";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("code", code);
		params.put("name", name);
		params.put("city", city);
		params.put("salary", salary);
		namedTemplate.update(sql, params);
	}
	public void deleteEmployee(String code)
	{
		String sql="delete from emp where code=:code1";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("code1", code);
		namedTemplate.update(sql, params);
		System.out.println("Record deleted");
	}
	
	// use of ResultSetExtractor
	public Employee getAnEmployee(String code)
	{
		Employee employee = null;
		String sql="select * from emp where code=:code1";
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("code1", code);
		employee=namedTemplate.query(sql, params, new ResultSetExtractor<Employee>() {
			@Override
			public Employee extractData(ResultSet res) throws SQLException,DataAccessException {
				
				res.next();
				Employee emp1=new Employee();
				emp1.setCode(res.getString("code"));
				emp1.setName(res.getString("name"));
				emp1.setCity(res.getString("city"));
				emp1.setSalary(res.getDouble("salary"));
				return emp1;
			}
		});
		return employee;
	}
	
	// use of RowMapper
	public List<Employee> getAllEmployees()
	{
		List<Employee> employees = null;
		Map<String, Object> params = new HashMap<String, Object>();
		employees = namedTemplate.query("select * from emp",params,	new RowMapper<Employee>() 
				{
					@Override
					public Employee mapRow(ResultSet rs, int rowNum)throws SQLException 
					{
						Employee emp = new Employee();
						emp.setCode(rs.getString("code"));
						emp.setName(rs.getString("name"));
						emp.setCity(rs.getString("city"));
						emp.setSalary(rs.getDouble("salary"));
						return emp;
					}
		});
		return employees;
	}
	
}