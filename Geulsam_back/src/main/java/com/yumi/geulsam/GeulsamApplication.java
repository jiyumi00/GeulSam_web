package com.yumi.geulsam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class GeulsamApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeulsamApplication.class, args);
	}

}
