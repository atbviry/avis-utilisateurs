package tech.chillo.avis.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import tech.chillo.avis.entities.Utilisateur;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, Integer>{
	public Optional<Utilisateur> findByEmail (String mail);
	
}
