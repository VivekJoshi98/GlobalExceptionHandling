package com.exception.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exception.exceptionhandler.ResourceNotFoundException;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home()
	{
		String str=null;
	//	int s=str.length();
		System.out.println(str.length());
		return "abc";
	}
	
	@GetMapping("/CustomException")
	public String house() throws ResourceNotFoundException
	{
		 String name="vivek";
		if(name.equals("ii"))
		{
				throw new ResourceNotFoundException("Not Found !!!");
			 		
		}
		System.out.println("ggggggggggggg");
		return name;
	}
}
