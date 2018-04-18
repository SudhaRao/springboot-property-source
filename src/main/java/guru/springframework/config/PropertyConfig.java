package guru.springframework.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import guru.springframework.beans.FakeDataSource;
import guru.springframework.beans.FakeJMSBroker;

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jmsbroker.properties"})
@PropertySources({
	@PropertySource("classpath:datasource.properties"),
	@PropertySource("classpath:jmsbroker.properties")
})
public class PropertyConfig {
	

	@Autowired
	Environment env;
	
	@Value("${datasource.username}") //datasource.username value from the datasource.properties file under resources folder
	String username;
	@Value("${datasource.password}")
	String password;
	@Value("${datasource.dburl}")
	String dburl;
	
	
	@Value("${jms.username}") //datasource.username value from the datasource.properties file under resources folder
	String jmsUsername;
	@Value("${jms.password}")
	String jmsPassword;
	@Value("${jms.url}")
	String jmsUrl;
	
	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUsername(env.getRequiredProperty("DB_USERNAME"));// this is from the environment variable setup under RUN Configurations
		//fakeDataSource.setUsername(username); // this way is using datasource.properties to pull the properties

		fakeDataSource.setPassword(password);
		fakeDataSource.setDburl(dburl);
		return fakeDataSource;
		
	}
	
	@Bean
	public FakeJMSBroker fakeJmsBroker() {
		FakeJMSBroker fakeJmsBroker = new FakeJMSBroker();
		fakeJmsBroker.setUsername(jmsUsername); // this way is using datasource.properties to pull the properties
		fakeJmsBroker.setPassword(jmsPassword);
		fakeJmsBroker.setUrl(jmsUrl);
		return fakeJmsBroker;
		
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
				new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}
	
	

}
