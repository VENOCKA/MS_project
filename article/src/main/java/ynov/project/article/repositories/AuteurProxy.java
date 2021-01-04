package ynov.project.article.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import ynov.project.article.config.CustomProperties;
import ynov.project.article.model.Auteur;


public class AuteurProxy {

	@Autowired
	public RestTemplate restTemplate;

	@Autowired
	private CustomProperties props;

	public Auteur getUser(int id) {

		String getUserUrl = props.getApiUrl() + "/auteur/" + id;
		ResponseEntity<Auteur> response = restTemplate.exchange(getUserUrl, HttpMethod.GET, null, Auteur.class);
		return response.getBody();
	}
	
}
