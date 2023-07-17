package com.rhythm.learnspring.advancespring.scopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component //default -> spring singleton scope -> one bean/class obj per spring container
//java singleton -> one class obj per JVM
class NormalClass {
	
}

//prototype scope -> will give new object reference whenever called
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {
	
}


@Configuration
@ComponentScan
//auto wiring & creation of objects
public class BeansScopeApplication {

	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext
					(BeansScopeApplication.class)) {
			
			System.out.println("Initialization of context is completed");
			
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));

		}
	}

}
