package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingServices;


//Constructor injected way of dependency injection is the most preferred way of doing dependency injection.
@Controller 
public class ConstructorInjectedController {
	
	public GreetingServices greetingServices;
	
	public String sayHello() {
		return greetingServices.sayGreeting();
	}

	public ConstructorInjectedController(@Qualifier("contructorGreetingService") GreetingServices greetingServices) {
		this.greetingServices = greetingServices;
	}
	
	
}
