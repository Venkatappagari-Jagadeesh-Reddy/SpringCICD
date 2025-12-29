package com.tap.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController 
{
	@GetMapping("/greeting")
	public String greeting()
	{
		return "Hello World! I am from Spring Boot";
	}
}
