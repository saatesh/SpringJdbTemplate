package com.sisco;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan("com.sisco")
public class EmployeeConfig {
	
	@Bean
	DataSource dataSource() {
		DataSourceBuilder<?> properties = DataSourceBuilder.create();
		properties.driverClassName("com.mysql.cj.jdbc.Driver");
		properties.url("jdbc:mysql://localhost:3306");
		properties.username("root");
		properties.password("root");
		
		return properties.build();
	}
	@Bean
	JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}
	
	

}
