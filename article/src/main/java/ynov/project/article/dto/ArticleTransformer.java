package ynov.project.article.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ynov.project.article.model.Article;
import ynov.project.article.model.Auteur;
import ynov.project.article.repositories.AuteurProxy;

@Component
public class ArticleTransformer {

	@Autowired
	private AuteurProxy auteurProxy;
	
	public ArticleR transform(Article a) {
		
		ArticleR articleR = new ArticleR();
		articleR.setId(a.getId());
		Auteur auteur = auteurProxy.getAuteur(a.getId());
		articleR.setAuteur(auteur);
		articleR.setCategorie(a.getCategorie());
		articleR.setContenu(a.getContenu());
		articleR.setDate(a.getDate());
		articleR.setIdCommentaire(a.getIdCommentaire());
		
		return articleR;
	}
}
