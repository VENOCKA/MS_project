package ynov.project.article.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ynov.project.article.model.Article;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Integer>{

}
