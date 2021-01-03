package ynov.project.auteur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	
	@PostMapping("/auteur")
	public Auteur createUser(@RequestBody Auteur auteur) {
		
		auteur = auteurRepository.save(auteur);
		
		return auteur;
	}
	
	
	
	@DeleteMapping("/auteur/{id}")
	public void deleteUser(@PathVariable("id") int id) {
		auteurRepository.deleteById(id);
	}
	
	
	
	@PutMapping("/auteur/{id}")
	public Auteur updateUser(@PathVariable("id") int id, @RequestBody Auteur auteur) {
		Auteur currentUser = auteurRepository.findById(id).get();
		
		String username = auteur.getName();
		if(username != null) {
			currentUser.setName(username);
		}
		
		String password = auteur.getPassword();
		if(password != null) {
			currentUser.setPassword(password);
		}
		
		String email = auteur.getEmail();
		if(password != null) {
			currentUser.setEmail(email);
		}
		
		currentUser = auteurRepository.save(currentUser);
		return currentUser;
	}
	
	
}
