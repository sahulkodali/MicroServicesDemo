package com.springboot.microservicesdemo.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springboot.microservicesdemo.model.Employ;

@Component
public class EmployDataAccessService {

	public static List<Employ> employee = new ArrayList<>();
	
	static{
		employee.add(new Employ(1,"hello",new Date()));
		employee.add(new Employ(2,"world",new Date()));
		employee.add(new Employ(3,"java",new Date()));
	}

	private static Integer employeeCount = 3;
	
	public List<Employ> findEmployee(){
		return employee;
	}
	
	public Employ addEmploy(Employ employ) {
		if(employ.getEmployeeId() == null) {
			employ.setEmployeeId(++employeeCount);
		}
		employee.add(employ);
		return employ;
	}
	
	public Employ findEmploy(int employeeId) {
		for(Employ employ: employee) {
			if(employeeId == employ.getEmployeeId()) {
				return employ;
			}
		}
		return null;
	}
}
