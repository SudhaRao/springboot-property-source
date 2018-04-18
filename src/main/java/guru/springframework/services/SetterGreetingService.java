package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingServices{

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello - I am injected using setter based dependency injection";
	}

}
