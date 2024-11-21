package com.sisco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJdbTemplateApplication {

	public static void main(String[] args) {
	   ConfigurableApplicationContext ac=	SpringApplication.run(SpringJdbTemplateApplication.class, args);
	   EmployeeController employee= ac.getBean(EmployeeController.class);
	   employee.save(new Employee(7, "subbu", 100000, "vij"));
	   
	}

}
