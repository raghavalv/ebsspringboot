package com.springboot.ebs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller 
{
	@Value("$(SPRING_DATASOURCE_URL)")
	private String SPRING_DATASOURCE_URL;
	
	@Value("$(DBusername)")
	private String DBusername;
	
	@GetMapping("/properties")
	public String printProperties()
	{
		return SPRING_DATASOURCE_URL + " " + DBusername;
	}

}
