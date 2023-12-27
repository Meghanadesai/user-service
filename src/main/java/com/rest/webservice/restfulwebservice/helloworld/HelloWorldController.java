package com.rest.webservice.restfulwebservice.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String hello() {
		return "HelloWorld";
	}
	
	@GetMapping("/hello-world-bean")
	public HellowWorldBean helloWorldBean() {
		return new HellowWorldBean("HelloWorld");
	}
	
	@GetMapping("/hello-world/path-variable/{name}")
	public HellowWorldBean helloWorldBean(@PathVariable String name) {
		return new HellowWorldBean(String.format("HelloWorld, %s", name));
	}
}
