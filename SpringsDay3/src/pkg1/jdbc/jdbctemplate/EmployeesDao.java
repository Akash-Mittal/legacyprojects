package pkg1.jdbc.jdbctemplate;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeesDao {
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void addEmployee(String code, String name, String city, double salary) {
		jdbcTemplate.update("insert into emp values(?,?,?,?)", code, name,
				city, salary);
	}

	public void deleteEmployee(String code) {
		jdbcTemplate.update("delete from emp where code=?", code);
	}

	public int getEmployeeCount() {
		return jdbcTemplate.queryForInt("select count(*) from emp");
	}

	// use of RowMapper
	public List<Employee> getAllEmployees() {
		List<Employee> employees = null;
		employees = jdbcTemplate.query("select * from emp",
				new RowMapper<Employee>() {
					@Override
					public Employee mapRow(ResultSet rs, int rowNum)
							throws SQLException {
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

	// batch processing in Spring
	// BatchPreparedStatementSetter is an anonomous class
	// is used to create batch statement in Spring
	public void addEmployeeBatch(final List<Employee> emps) {
		String sql = "insert into emp values(?,?,?,?)";
		jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps, int i)
					throws SQLException {
				Employee emp = emps.get(i);
				ps.setString(1, emp.getCode());
				ps.setString(2, emp.getName());
				ps.setString(3, emp.getCity());
				ps.setDouble(4, emp.getSalary());
			}

			@Override
			public int getBatchSize() {
				return emps.size();
			}
		});

	}

	public Employee callProcedure(final String code) {
		Employee emp = jdbcTemplate.execute("{call proc2(?)}",
				new CallableStatementCallback<Employee>() {
					@Override
					public Employee doInCallableStatement(CallableStatement cs)
							throws SQLException, DataAccessException {
						cs.setString(1, code);
						ResultSet res = cs.executeQuery();
						res.next();
						Employee emp1 = new Employee();
						emp1.setCode(res.getString("code"));
						emp1.setName(res.getString("name"));
						emp1.setCity(res.getString("city"));
						emp1.setSalary(res.getDouble("salary"));
						return emp1;
					}
				});
		return emp;
	}
}