package tech.chillo.avis.services;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tech.chillo.avis.Person;
import tech.chillo.avis.entities.Avis;
import tech.chillo.avis.entities.Utilisateur;
import tech.chillo.avis.repositories.AvisRepository;
import tech.chillo.avis.repositories.UtilisateurRepository;

@AllArgsConstructor
@Service
public class UtilisateurServiceIpml implements UtilisateurService{
	private final UtilisateurRepository utilisateurRepository;

	@Override
	public void inscrire(Utilisateur utilisateur) {
		this.utilisateurRepository.save(utilisateur);
		
	}

}
