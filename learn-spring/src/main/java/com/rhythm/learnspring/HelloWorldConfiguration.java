package com.rhythm.learnspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//Eliminate verbosity in creating Java Beans
//Public accessor methods, constructor, 
//equals, hashcode and toString are automatically created. 
//Released in JDK 16.

record Person (String name, int age) { };

//Address - firstLine & city
record Address(String firstLine, String city){ };

@Configuration
public class HelloWorldConfiguration {
//here we define spring beans(things managed by spring)
	@Bean
	public String name() {
		return "Rhythm";
	}
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		return new Person("Ravi", 20);		
	}
	
	@Bean
	public Address address() {
		return new Address("Baker Street", "London");		
	}
}
