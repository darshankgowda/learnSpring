package com.atdkg.learnspringframework.examples.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component - instead of it use @Repository
@Repository  //
@Primary
public class MongoDbDataService implements DataService{
	
	@Override
	public int[] retrieveData() {
		return new int[] {11,22,33,44};
	}
	
}
