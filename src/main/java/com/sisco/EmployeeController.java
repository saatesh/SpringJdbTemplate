package com.sisco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	public void save(Employee emp)
	{
		System.out.println("EmployeeController started.");
		empService.save(emp);
	}
	public void update(int eid, double esal,String elocation) {
		System.out.println("EmployeeController started.");
		empService.update(eid,esal,elocation);
	}
	public void deleteById(int eid) {
		System.out.println("EmployeeController started.");
		empService.deleteById(eid);
	}

}
