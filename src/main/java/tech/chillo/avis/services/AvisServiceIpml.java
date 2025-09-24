package tech.chillo.avis.services;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tech.chillo.avis.entities.Avis;
import tech.chillo.avis.repositories.AvisRepository;

@AllArgsConstructor
@Service
public class AvisServiceIpml implements AvisService {
	private final AvisRepository avisRepository;

	@Override
	public void creerAvis(Avis avis) {
		this.avisRepository.save(avis);
		
	}

}
