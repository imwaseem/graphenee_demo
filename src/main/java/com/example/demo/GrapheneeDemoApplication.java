package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.graphenee.core.GrapheneeCoreConfiguration;

@SpringBootApplication
@EnableJpaRepositories({"com.example.demo",GrapheneeCoreConfiguration.JPA_REPOSITORIES_BASE_PACKAGE})
@EntityScan({"com.example.demo",GrapheneeCoreConfiguration.ENTITY_SCAN_BASE_PACKAGE})
public class GrapheneeDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrapheneeDemoApplication.class, args);
	}
}
