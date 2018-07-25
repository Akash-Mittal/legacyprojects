package pkg1.jndidemo;


import org.springframework.jdbc.core.JdbcTemplate;

public class EmpDao {
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void create(String code, String name, String city, int salary) {
		String sql = "insert into emp values('" + code + "','" + name + "','"
				+ city + "'," + salary + ")";
		jdbcTemplate.execute(sql);
	}
}
