package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class ContructorGreetingService implements GreetingServices{

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello - I am injected using contructor based dependency injection";
	}

}
