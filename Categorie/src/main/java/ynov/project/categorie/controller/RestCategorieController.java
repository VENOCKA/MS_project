package ynov.project.categorie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ynov.project.categorie.model.Categorie;
import ynov.project.categorie.repositories.CategorieRepository;


/**
 * CRUD API Auteur
 * @author thomas
 *
 */

@RestController
public class RestCategorieController {
	
	@Autowired
	private CategorieRepository categorieRepository;
	

	@GetMapping("/categorie")
	public Iterable<Categorie> getUsers(){
		
		Iterable<Categorie> auteurs = categorieRepository.findAll();
		System.out.println("trace");
		return auteurs;
	}
	
	
	@PostMapping("/categorie")
	public Categorie createUser(@RequestBody Categorie categorie) {
		
		categorie = categorieRepository.save(categorie);
		
		return categorie;
	}
	
	
	
	@DeleteMapping("/categorie/{id}")
	public void deleteUser(@PathVariable("id") int id) {
		categorieRepository.deleteById(id);
	}
	
	
	
	@PutMapping("/categorie/{id}")
	public Categorie updateUser(@PathVariable("id") int id, @RequestBody Categorie categorie) {
		Categorie currentUser = categorieRepository.findById(id).get();
		
		String username = categorie.getName();
		if(username != null) {
			currentUser.setName(username);
		}
		
		currentUser = categorieRepository.save(currentUser);
		return currentUser;
	}

}
