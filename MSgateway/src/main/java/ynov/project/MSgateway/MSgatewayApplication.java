package ynov.project.MSgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MSgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MSgatewayApplication.class, args);
	}

}
