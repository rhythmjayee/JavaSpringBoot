package com.springwebapp.firstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	//"say-hello" => "Hello! What are you learning today?"
	
	//say-hello
	// http://localhost:8080/say-hello
	@RequestMapping("say-hello")
	@ResponseBody //-> for sending same string from function
	public String sayHelloString() {
		return "Hello! What are you learning today?";
	}
	
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}

}