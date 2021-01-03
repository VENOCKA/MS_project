package ynov.project.auteur.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ynov.project.auteur.model.Auteur;

@Repository
public interface AuteurRepository extends CrudRepository<Auteur, Integer>{

}


