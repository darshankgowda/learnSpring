package com.atdkg.learnspringframework.examples.g1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named   //cdi alternative
class BuisnessService {
	
	private DataService dataService;
	
	//@Autowired
	@Inject   //the cdi annotations are alternative to spring annotations
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}
	public DataService getDataService() {
		System.out.println("Setter Injection");
		return dataService;
	}
}
//@Component
@Named
class DataService {
	
}

@Configuration
@ComponentScan("com.atdkg.learnspringframework.examples.g1") //pass the package name where @component is situated

public class CdiContextLauncherApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class)) {
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out :: println); //@ComponentScan is necessary
			System.out.println(context.getBean(BuisnessService.class).getDataService());
		}	
	}
}
