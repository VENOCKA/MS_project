package ynov.project.article.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {

	@GetMapping("/")
	public String home() {
		
		return "homePage";
		
	}
}
