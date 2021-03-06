package com.springboot.microservicesdemo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.microservicesdemo.model.HelloWorldBeanDemonstartion;

@RestController
public class DemoController {

	@GetMapping(path = "/hello-world")public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBeanDemonstartion helloWorldBeanDemo() {
		return new HelloWorldBeanDemonstartion("Controller Returning Bean Demo");
	}
	
	@GetMapping(path = "/hello-world-pathVariable/{param}")
	public HelloWorldBeanDemonstartion helloWorldPathVariableDemo(@PathVariable String param) {
		return new HelloWorldBeanDemonstartion(String.format("Hello, this is %s Controller Demonstrating the usage of Path Variable!!!", param));
	}
}
