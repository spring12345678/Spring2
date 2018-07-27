package com.java;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorld {
	@RequestMapping("/hello")
	public String hello(Model model,@RequestParam(value="name",required=false,defaultValue="world") String name)
	{
		String message="I just created Spring Boot Application Successfully";
		model.addAttribute("name",name);
		model.addAttribute("message",message);
		return "hello";
		
	}

}
