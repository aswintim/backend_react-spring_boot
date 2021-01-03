package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//controller

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class HelloWorldController {

//	GET 
//	URI - /hello-world
//	method- "Hello World!"
	@RequestMapping(method=RequestMethod.GET, path="/hello-world") 
	public String helloWorld() {
		return "Hello Aswin";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello Aswin Google");
	}
	
	// /hello-world/path-variable/in28minutes
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World %s", name));
//		throw new RuntimeException("Something went wrong -Aswin");
	}
	
}
