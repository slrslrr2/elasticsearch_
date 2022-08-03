package com.elasticsearch.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SearchApplication {
	public static void main(String[] args) {
		// http://localhost:8897/swagger-ui/
		SpringApplication.run(SearchApplication.class, args);
	}

}
