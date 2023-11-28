package com.atdkg.learnspringframework.examples.c1;

import java.util.Arrays;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component //we want to make @Component to the class who are involved in dependency injection process
@Service  //if there any business logic defined
public class BuisnessCalculationService {
	private DataService dataService;
	
	public BuisnessCalculationService(DataService dataService) {
		this.dataService = dataService;
	}
	
	public int findMax() {
	    return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
}
