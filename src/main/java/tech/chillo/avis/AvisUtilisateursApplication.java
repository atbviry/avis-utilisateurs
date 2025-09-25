package tech.chillo.avis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import tech.chillo.avis.entities.Role;
import tech.chillo.avis.entities.TypeDeRole;
import tech.chillo.avis.entities.Utilisateur;

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
		Role role = Role.builder()
				.id(1)
				.libelle(TypeDeRole.UTILSATEUR)
				.build();
		
		Utilisateur utilisateur = Utilisateur.builder()
				.nom("Charles COLL")
				.email("atb@gmail.com")
				.mdp("password")
				.role(role)
				.build();
		ObjectMapper mapper = new ObjectMapper();
		try {
			String json = mapper.writeValueAsString(utilisateur);
			System.out.print(json);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
