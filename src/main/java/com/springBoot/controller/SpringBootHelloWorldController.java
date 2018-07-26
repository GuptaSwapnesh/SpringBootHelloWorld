package com.springBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootHelloWorldController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello World by Spring Boot!!!";
	}

}
