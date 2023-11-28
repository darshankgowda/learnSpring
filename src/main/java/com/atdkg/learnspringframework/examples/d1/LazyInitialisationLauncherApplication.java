package com.atdkg.learnspringframework.examples.d1;

import java.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class classA {
	
}
@Component
@Lazy
class classB {
	private classA classA;
	
	public classB(classA classA) {
		System.out.println("some initialization logic");
		this.classA = classA;
	}
	public void doSomething() {
		System.out.println("Do something");
	}
}


@Configuration
@ComponentScan("com.atdkg.learnspringframework.examples.d1") //pass the package name where @component is situated

public class LazyInitialisationLauncherApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(LazyInitialisationLauncherApplication.class)) {
			System.out.println("some initialization of context is completed");
			context.getBean(classB.class).doSomething();
		}	
	}
}
