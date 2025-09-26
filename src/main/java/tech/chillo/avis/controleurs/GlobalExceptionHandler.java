package tech.chillo.avis.controleurs;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import tech.chillo.avis.exception.EmailIvalideException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(EmailIvalideException.class)
    public ResponseEntity<Map<String, String>> handleRessourceIntrouvable(EmailIvalideException ex) {
        Map<String, String> erreur = new HashMap<>();
        erreur.put("erreur", ex.getMessage());
        erreur.put("code", "409");
        return ResponseEntity.status(HttpStatus.CONFLICT).body(erreur);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, String>> handleExceptionGenerique(Exception ex) {
        Map<String, String> erreur = new HashMap<>();
        erreur.put("erreur", "Erreur interne du serveur");
        erreur.put("details", ex.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(erreur);
    }

}
