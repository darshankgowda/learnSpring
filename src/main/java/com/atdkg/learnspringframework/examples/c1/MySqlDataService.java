package com.atdkg.learnspringframework.examples.c1;

import org.springframework.stereotype.Component;

@Component
public class MySqlDataService implements DataService{

	@Override
	public int[] retrieveData() {
		int[] arr = new int[] {1,2,3,4,5};
		return arr;
	}

}
