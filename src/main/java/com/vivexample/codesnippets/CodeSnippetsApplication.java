package com.vivexample.codesnippets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CodeSnippetsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeSnippetsApplication.class, args);
	}

}