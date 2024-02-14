package com.mentorbaba.demo.contollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello SpringBoot Application";
		
	}
	
	@GetMapping("/helloWorld")
	public String worldHello() {
		return "Hello SpringBoot Application 2.0";
		
	}


}
