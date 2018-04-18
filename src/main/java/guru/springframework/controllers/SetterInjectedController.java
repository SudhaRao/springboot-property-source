package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingServices;


// This setter injected controller is also a not a good way of doing dependency Injection
@Controller
public class SetterInjectedController {
	
	public GreetingServices greetingServices;
	
	public String sayHello() {
		return greetingServices.sayGreeting();
	}
	
	@Autowired
	@Qualifier("setterGreetingService")
	public void setGreetingServices(GreetingServices greetingServices) {
		this.greetingServices = greetingServices;
	}
}
