package tech.chillo.avis.services;

import java.util.Optional;

import org.apache.catalina.util.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tech.chillo.avis.Person;
import tech.chillo.avis.Utilitaire;
import tech.chillo.avis.entities.Avis;
import tech.chillo.avis.entities.Role;
import tech.chillo.avis.entities.TypeDeRole;
import tech.chillo.avis.entities.Utilisateur;
import tech.chillo.avis.exception.EmailIvalideException;
import tech.chillo.avis.repositories.AvisRepository;
import tech.chillo.avis.repositories.UtilisateurRepository;

@AllArgsConstructor
@Service
public class UtilisateurServiceIpml implements UtilisateurService {
	private final UtilisateurRepository utilisateurRepository;
	private final PasswordEncoder passwordEncoder;

	@Override
	public void inscrire(Utilisateur utilisateur) throws EmailIvalideException {
//		if (utilisateur != null && StringUtils.isNotBlank(utilisateur.getEmail()) 
//				&& !utilisateur.getEmail().contains("@")) {
//			throw new UtilisateurException("Votre mail invalide, @ manquant");
//
//		}
//		
//		if (utilisateur != null && StringUtils.isNotBlank(utilisateur.getEmail())
//				&& !utilisateur.getEmail().contains(".")) {
//			throw new UtilisateurException("Votre mail invalide, . manquant");
//
//		}
//		
		if (utilisateur != null && StringUtils.isNotBlank(utilisateur.getEmail()) 
				&& Utilitaire.contientArobaseEtPoint(utilisateur.getEmail())==false) {
			throw new EmailIvalideException("Votre mail invalide");

		}
		
		
		Optional<Utilisateur> optionalUtilisateur = utilisateurRepository
				.findByEmail(utilisateur.getEmail());
		if (optionalUtilisateur.isPresent()) {
			throw new EmailIvalideException("Votre mail est déjà utilisé");
		}

		String pwdCripte = this.passwordEncoder.encode(utilisateur.getPassword());
		utilisateur.setMdp(pwdCripte);

		Role roleUtilisateur = Role.builder().libelle(TypeDeRole.UTILSATEUR).build();
		utilisateur.setRole(roleUtilisateur);

		this.utilisateurRepository.save(utilisateur);

	}

}
