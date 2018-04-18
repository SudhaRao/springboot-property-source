package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingServicesImpl;


// Property injected controller is an example of what and how not to do Dependency INjec tion
@Controller
public class PropertyInjectedController {
	
	@Autowired
	public GreetingServicesImpl greetingServices;
		
	public String sayHello() {
		return greetingServices.sayGreeting();
	}
	

	

}
