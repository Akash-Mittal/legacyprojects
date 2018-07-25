package pkg1.connectiondemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DataConnection {
	// database connection programaticaly
	public void databaseConnection1() {
		DriverManagerDataSource ds = new DriverManagerDataSource();

		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost/test");
		ds.setUsername("root");
		ds.setPassword("root");
		JdbcTemplate jdbctemplate = new JdbcTemplate(ds);
		jdbctemplate.execute("insert into emp values('a010','sks','noida',2222)");
		System.out.println("inserted");
	}
// database connection using bean
	public void databaseConnection2() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:pkg1/connectiondemo/beans1.xml");
		
		DriverManagerDataSource ds = ctx.getBean("dataSource",DriverManagerDataSource.class);
		JdbcTemplate jdbctemplate = new JdbcTemplate(ds);
		jdbctemplate.execute("insert into emp values('a011','sks','noida',2222)");
		System.out.println("inserted");
		
	}

	public static void main(String[] args) {
		//new DataConnection().databaseConnection1();
		new DataConnection().databaseConnection2();
	}

}
