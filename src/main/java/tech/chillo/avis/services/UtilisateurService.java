package tech.chillo.avis.services;

import tech.chillo.avis.entities.Utilisateur;

public interface UtilisateurService {
	//ça sert à créer l'inscription de l'utilisateur
	//la bonne pratique c'est de passer un DTO
	public void inscrire(Utilisateur utilisateur);

}
