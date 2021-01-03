package ynov.project.categorie.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ynov.project.categorie.model.Categorie;

@Repository
public interface CategorieRepository extends CrudRepository<Categorie, Integer>{

}
