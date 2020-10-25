package com.letslearn.letslearnrestserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication
public class LetslearnRestServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LetslearnRestServerApplication.class, args);
	}

}
