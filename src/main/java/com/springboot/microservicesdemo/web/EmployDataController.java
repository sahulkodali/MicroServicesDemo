package com.springboot.microservicesdemo.web;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
		
		Employ employ = employDataService.findEmploy(employId);
		
		if (employ == null){			
			throw new EmployNotFoundException("Employ with "+employId+" not found");
		}
		
		return employDataService.findEmploy(employId);
	}
	
	@PostMapping("/addemploytotherepository")
	public ResponseEntity addemploytotherepository(@RequestBody Employ employ) {
		Employ savedEmploy = employDataService.addEmploy(employ);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedEmploy.getEmployeeId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
}