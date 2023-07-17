package com.rhythm.learnspring.examples.specific_annotations;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
//auto wiring & creation of objects
public class RealWorldSpringContextLauncherApplication {

	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext
					(RealWorldSpringContextLauncherApplication.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			System.out.println(context.getBean
					(BusinessCalculationService.class).findMax());
		}
	}

}
