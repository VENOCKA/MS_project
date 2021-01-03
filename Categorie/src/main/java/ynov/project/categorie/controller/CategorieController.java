package ynov.project.categorie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategorieController {
	
	@GetMapping("/")
	public String home() {
		
		return "homePage";
		
	}

}
