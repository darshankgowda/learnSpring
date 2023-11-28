package com.atdkg.learnspringframework.examples.h1;

import java.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atdkg.learnspringframework.GameRunner;

public class XmlConfigurationContextLauncherApplication {
	
	public static void main(String[] args) {
		try (var context = new ClassPathXmlApplicationContext("contextconfiguration.xml")) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out :: println); //@ComponentScan is necessary
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));	
			context.getBean(GameRunner.class).run();	
		}			
	}
}
