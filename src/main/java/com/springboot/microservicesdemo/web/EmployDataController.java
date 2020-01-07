package com.springboot.microservicesdemo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.microservicesdemo.model.Employ;
import com.springboot.microservicesdemo.repository.EmployDataAccessService;

@RestController
public class EmployDataController {

	@Autowired
	EmployDataAccessService employDataService;
	
	@GetMapping("/retrieveemployee")
	public List<Employ> retrieveEmployee() {
		return employDataService.findEmployee();
	}
	
	@GetMapping("/retrieveemploybyid/{employId}")
	public Employ retrieveEmployById(@PathVariable int employId) {
		return employDataService.findEmploy(employId);
	}
	
}
