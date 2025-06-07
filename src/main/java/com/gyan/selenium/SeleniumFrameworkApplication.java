package com.gyan.selenium;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.gyan.selenium")
@EnableAutoConfiguration
public class SeleniumFrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeleniumFrameworkApplication.class, args);
	}

}
