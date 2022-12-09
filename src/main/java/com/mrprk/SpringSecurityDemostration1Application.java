package com.mrprk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringSecurityDemostration1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityDemostration1Application.class, args);
	}

}
