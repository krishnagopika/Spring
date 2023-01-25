package com.aws.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class HomeContoller {
	@RestController  
	public class HelloWorldController   
	{  
	@RequestMapping("/home")  
	public String hello()   
	{  
	return "Hello javaTpoint";  
	}  

}
}
