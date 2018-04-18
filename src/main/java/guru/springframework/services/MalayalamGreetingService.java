package guru.springframework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("ma")
public class MalayalamGreetingService implements GreetingServices{
	
	
	
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello from Malayalam Greeting Service";
	}


}
