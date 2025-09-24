package tech.chillo.avis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@SpringBootApplication()
public class AvisUtilisateursApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvisUtilisateursApplication.class, args);
		Person person = Person.builder()
				.age(15)
				.name("Tidiane")
				.build();
		System.out.println(person);
		
	}

}
