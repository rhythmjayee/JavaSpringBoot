package com.rhythm.learnspring.advancespring.lazyinitilization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component // - eager Initialization
class ClassA {
	
}

@Component
@Lazy //-> to lazily initialize the class, class will load only on invocation
class ClassB {
	
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		//Logic
		System.out.println("Some Initialization logic");
		this.classA = classA;
	}
	
	public void doSomething() {
		System.out.println("Do Something");
	}
	
}

@Configuration
@ComponentScan
//auto wiring & creation of objects
public class LazyInitilizationApplication {

	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext
					(LazyInitilizationApplication.class)) {
			
			System.out.println("Initialization of context is completed");
			
			context.getBean(ClassB.class).doSomething();

		}
	}

}
