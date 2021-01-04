package ynov.project.article.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ynov.project.article.dto.ArticleR;
import ynov.project.article.service.ArticleService;

@RestController
public class RestArticleController {
	
	@Autowired
	private ArticleService articleService;
	
	@GetMapping("/product/{id}")
	public ArticleR getProduct(@PathVariable("id") int id) {
		return articleService.getArticle(id);
	}
	
	@GetMapping("/product")
	public Iterable<ArticleR> getProducts() {
		return articleService.getArticles();
	}

}
