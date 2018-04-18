package guru.springframework.services;


import org.springframework.stereotype.Service;

@Service

public class GreetingServicesImpl implements GreetingServices{
	
	public static final String HELLO_GURU = "HELLO GURUS !!!";
	
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return HELLO_GURU;
	}
	
	

}
