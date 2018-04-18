package guru.springframework.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingServices;

@Controller
public class HelloController {
	
	@Autowired
	private GreetingServices greetingService;
	
	public HelloController(GreetingServices greetingService) {
		this.greetingService = greetingService;
	}
	public String sayHello() {
		System.out.println("Hello !!!!");
		return greetingService.sayGreeting();
	}
}
