package com.project1.learnspringframework.SpringLauncherBusinessCalculationApp;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {
	
	private DataService ds;
	
	public int findMax()
	{
		return Arrays.stream(ds.retrieveData()).max().orElse(0);
	}

	public BusinessCalculationService(DataService ds) {
		super();
		this.ds = ds;
	}

}
