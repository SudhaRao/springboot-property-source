package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.beans.FakeDataSource;
import guru.springframework.beans.FakeJMSBroker;

@SpringBootApplication
public class SpringbootPropertySourceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringbootPropertySourceApplication.class, args);		
		
		
		System.out.println("---------> DataSource Properties values <----------- \n");

		FakeDataSource fakeDataSource = (FakeDataSource)ctx.getBean(FakeDataSource.class);
		
		System.out.println("\n username: " + fakeDataSource.getUsername());
		System.out.println("\n password: " + fakeDataSource.getPassword());
		System.out.println("\n dburl: " + fakeDataSource.getDburl() +"\n");
		
		System.out.println("--------->JMS Properties values <-----------\n");
		
		FakeJMSBroker fakeJmsBroker = (FakeJMSBroker)ctx.getBean(FakeJMSBroker.class);
		
		System.out.println("\n username: " + fakeJmsBroker.getUsername());
		System.out.println("\n password: " + fakeJmsBroker.getPassword());
		System.out.println("\n dburl: " + fakeJmsBroker.getUrl() +"\n");


	
	}
}
