package ynov.project.auteur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ynov.project.auteur.model.Auteur;
import ynov.project.auteur.repositories.AuteurRepository;

/**
 * CRUD API Auteur
 * @author thomas
 *
 */

@RestController
public class RestAuteurController {

	@Autowired
	private AuteurRepository auteurRepository;
	
	
	@GetMapping("/auteur")
	public Iterable<Auteur> getUsers(){
		
		Iterable<Auteur> auteurs = auteurRepository.findAll();
		System.out.println("trace");
		return auteurs;
	}
	
	
}
