package com.springboot.microservicesdemo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping(path = "/hello-world")public String helloWorld() {
		return "Hello World";
	}
}
