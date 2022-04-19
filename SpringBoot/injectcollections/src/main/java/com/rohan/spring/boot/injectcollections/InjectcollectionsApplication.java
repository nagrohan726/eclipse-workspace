package com.rohan.spring.boot.injectcollections;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InjectcollectionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(InjectcollectionsApplication.class, args);
	}

	@Bean
	public List<String> courseList() {
		return Arrays.asList("Java", "Python", "Node", "DevOps");
	}

}
