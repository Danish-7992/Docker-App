package com.danish.Docker.Spring.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringAppApplication.class, args);
		System.out.print("Danish Alam");
	}

}
