package tech.chillo.avis.controleurs;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import tech.chillo.avis.entities.Avis;
import tech.chillo.avis.services.AvisService;

@AllArgsConstructor
@RequestMapping("avis")
@RestController
public class AvisControleur {
	private final AvisService avisService;
	
	@ResponseStatus(value = HttpStatus.CREATED)
	@PostMapping
	public void creerAvis(@RequestBody Avis avis) {
		this.avisService.creerAvis(avis);
	}

}
