package com.rhythm.learnspring.examples.specific_annotations;

import java.util.Arrays;

import org.springframework.stereotype.Service;

//@Component
@Service // class which has business logic
public class BusinessCalculationService {
	
	private DataService dataService;
	
	public BusinessCalculationService(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}

}
