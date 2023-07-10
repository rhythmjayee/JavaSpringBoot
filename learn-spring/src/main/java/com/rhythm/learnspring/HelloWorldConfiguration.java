package com.rhythm.learnspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
//here we define spring beans(things managed by spring)
	@Bean
	public String name() {
		return "Rhythm";
	}
}
