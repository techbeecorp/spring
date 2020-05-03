package com.techbee.spring.rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

	@GetMapping("/")
	public String helloworld() {
		return "Hello World";
	}
	
	@GetMapping("/greet/{name}")
	public String greet(@PathVariable String name) {
		return "Hello "+name;
	}
}
