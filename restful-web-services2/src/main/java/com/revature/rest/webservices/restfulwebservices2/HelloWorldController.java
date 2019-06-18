package com.revature.rest.webservices.restfulwebservices2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//@RequestMapping(method=RequestMethod.GET,path="/hello-world")
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

}
