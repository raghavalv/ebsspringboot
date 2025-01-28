package com.springboot.ebs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Maincontroller 
{
	@GetMapping("/welcome")
	public String welcomePage() 
	{
		return "Welcome to my web app!";
		
	}

}
