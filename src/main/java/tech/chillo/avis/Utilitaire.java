package tech.chillo.avis;

public class Utilitaire {
	
	public static boolean contientArobaseEtPoint(String texte) {
	    return texte != null && texte.contains("@") && texte.contains(".");
	}

}
