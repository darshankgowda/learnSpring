package com.atdkg.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.atdkg.learnspringframework") //pass the package name where @component is situated

public class GamingAppLauncherApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
			context.getBean(GamingConsole.class).up(); //since GamingConsole is common return type for all Games)	
			context.getBean(GameRunner.class).run();
			
		}
	}
}
