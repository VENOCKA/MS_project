package ynov.project.article.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ynov.project.article.dto.ArticleR;
import ynov.project.article.dto.ArticleTransformer;
import ynov.project.article.model.Article;
import ynov.project.article.repositories.ArticleRepository;

@Service
public class ArticleService {

	@Autowired
	private ArticleRepository articleRepository;
	
	@Autowired
	private ArticleTransformer articleTransformer;
	
	public ArticleR getArticle(int id) {
		Article article = articleRepository.findById(id).get();		
		ArticleR articleR = articleTransformer.transform(article);		
		return articleR;
	}
	
	public Iterable<ArticleR> getArticles() {
		
		Iterable<Article> articles = articleRepository.findAll();
		ArrayList<ArticleR> articleRs = new ArrayList<ArticleR>();
		
		Iterator<Article> iterator = articles.iterator();
		while(iterator.hasNext()) {
			Article a = iterator.next();
			ArticleR articleR = articleTransformer.transform(a);
			articleRs.add(articleR);
		}
		return articleRs;		
	}
}
