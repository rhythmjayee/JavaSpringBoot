package com.rhythm.learnspring.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGameSpringBeans {

	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext
					(GamingConfiguration.class)) {

			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();

		}
	}

}
