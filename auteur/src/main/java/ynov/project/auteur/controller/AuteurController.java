package ynov.project.auteur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuteurController {
	
	@GetMapping("/")
	public String home() {
		
		return "homePage";
		
	}

}
