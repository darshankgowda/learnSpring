package com.atdkg.learnspringframework.examples.c1;

import java.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration 
@ComponentScan("com.atdkg.learnspringframework.examples.c1") //pass the package name where @component is situated

public class RealWorldSpringContextLauncherApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(RealWorldSpringContextLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out :: println);
			System.out.println(context.getBean(BuisnessCalculationService.class).findMax());
		}	
	}
}
