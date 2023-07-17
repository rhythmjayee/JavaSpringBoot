package com.rhythm.learnspring.examples.java_xml_config;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//@Configuration
//@ComponentScan
//auto wiring & creation of objects
public class XmlConfigurationContextLauncherApplication {

	public static void main(String[] args) {

		try (var context = 
				new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			System.out.println(context.getBean("name"));
			
			System.out.println(context.getBean("age"));
			
//			context.getBean(GameRunner.class).run();

		}
	}

} 
