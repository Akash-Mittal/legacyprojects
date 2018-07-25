package pkg11.configurationbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeBean {

	@Bean
	public EmployeeServiceImpl empService()
	{
		return new EmployeeServiceImpl();
	}
}
