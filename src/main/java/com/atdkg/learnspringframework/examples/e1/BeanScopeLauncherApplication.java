package com.atdkg.learnspringframework.examples.e1;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass {
	
}
@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)  //@Scope(value="prototype")
class PrototypeClass {
	
}

@Configuration
@ComponentScan("com.atdkg.learnspringframework.examples.e1") //pass the package name where @component is situated

public class BeanScopeLauncherApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(BeanScopeLauncherApplication.class)) {
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));			
		}	
	}
}
