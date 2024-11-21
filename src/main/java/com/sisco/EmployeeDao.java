package com.sisco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class EmployeeDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void save(Employee emp) {
		System.out.println("EmpDao started.");
		int n=jdbcTemplate.update("insert into springjdbc.employee values(?,?,?,?)", emp.getEid(),emp.getEname(),emp.getEsal(),emp.getElocation());
		System.out.println("Data saved successfully.. "+n);
	}

	public void update() {
		System.out.println("EmpDao started.");

		// TODO Auto-generated method stub
		
	}

	public void deleteById(int eid) {
		// TODO Auto-generated method stub
		
	}

}
