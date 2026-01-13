package com.tap.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetingController {
	@GetMapping("greeting")
	public String greeting()
	{
		return "Hello I am Jagadeesh Reddy! I am from CICD is Working!";
	}
	
	@GetMapping("hello")
	public String hello()
	{
		return "Hello I done a Mistake I am Sorry for that!";	
	}

}
