package com.rhythm.learnspring.advancespring.postcontruct_predelete;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {
	
	private SomeDependency someDependency;
	
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All dependencies are ready!");
	}
	
	@PostConstruct //-> wired the initialization of other stuffs
	public void initialize() {
		someDependency.getReady();
	}
	
	@PreDestroy // wired the cleanup of resources just before deletion
	public void cleanup() {
		System.out.println("Cleanup");
	}
	
}

@Component 
class SomeDependency {

	public void getReady() {
		System.out.println("Some logic using SomeDependency");
		
	}
	
}

@Configuration
@ComponentScan
//auto wiring & creation of objects
public class PrePostAnnotationsContextLauncherApplication {

	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext
					(PrePostAnnotationsContextLauncherApplication.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);

		}
	}

}
