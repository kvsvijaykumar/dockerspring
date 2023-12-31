package com.example.dockerspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerSpringApplication {

	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to NatWest";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringApplication.class, args);
	}

}
