package ynov.project.auteur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AuteurApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuteurApplication.class, args);
	}

}
