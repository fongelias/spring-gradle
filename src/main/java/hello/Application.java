package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Adds configuration + enable autoconfiguration + component scan annotations
//configuration tags the class as a source of bean definitions for the application context
//enable autoconfiguration tells spring boot to start adding beans based on settings
//component scan tells spring to look for other components in the hello package
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}