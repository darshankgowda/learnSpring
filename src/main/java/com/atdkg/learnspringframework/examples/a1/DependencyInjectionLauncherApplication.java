package com.atdkg.learnspringframework.examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
class YourbuisnessClass {

	Dependency1 dependency1;
	Dependency2 dependency2;
	
	@Autowired
	public YourbuisnessClass(Dependency1 dependency1, Dependency2 dependency2) {
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}
	
//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		this.dependency1 = dependency1;
//	}
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		this.dependency2 = dependency2;
//	}
	public String toString() {
		return dependency1 + " and " + dependency2;
	}
}
@Component
class Dependency1 {
	
}
@Component
class Dependency2 {

	
}

@Configuration
@ComponentScan("com.atdkg.learnspringframework.examples.a1") //pass the package name where @component is situated

public class DependencyInjectionLauncherApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out :: println);
			System.out.println(context.getBean(YourbuisnessClass.class));
			
		}	
	}
}
