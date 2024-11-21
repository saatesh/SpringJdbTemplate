package com.sisco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class EmployeeService {
	@Autowired
	private EmployeeDao empDao;

	public void save(Employee emp) {
		System.out.println("EmployeeService started.");
		empDao.save(emp);
		
	}

	public void update(int eid, double esal, String elocation) {
		System.out.println("EmployeeService started.");
		empDao.update();
		
	}

	public void deleteById(int eid) {
		System.out.println("EmployeeService started.");
		empDao.deleteById(eid);
	}

}
