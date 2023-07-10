package com.rhythm.learnspring.games.game2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.rhythm.learnspring.games.game2.gameclasses.GameRunner;
import com.rhythm.learnspring.games.game2.gameclasses.GamingConsole;

@Configuration
@ComponentScan("com.rhythm.learnspring.games.game2.gameclasses") 
//auto wiring & creation of objects
public class AppGameSpringBeans {

	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext
					(AppGameSpringBeans.class)) {

//			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();

		}
	}

}
