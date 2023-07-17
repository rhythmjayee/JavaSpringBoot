package com.rhythm.learnspring.examples.specific_annotations;

import org.springframework.stereotype.Repository;

//@Component
@Repository // classes which handles data 
public class MySqlDataService implements DataService {

	@Override
	public int[] retrieveData() {
		return new int[] { 1, 2, 3, 4, 5 };
	}

}
