package tech.chillo.avis.controleurs;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import tech.chillo.avis.entities.Utilisateur;
import tech.chillo.avis.services.UtilisateurService;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
public class UtilisateurControleur {
	private final UtilisateurService utilisateurService;
	
	@PostMapping(path = "inscription")
	public void inscrire(@RequestBody Utilisateur utilisateur) {
		log.info("Inscription utilisateur");
		this.utilisateurService.inscrire(utilisateur);

	}

}
