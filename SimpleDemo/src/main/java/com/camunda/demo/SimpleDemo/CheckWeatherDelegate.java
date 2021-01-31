package com.camunda.demo.SimpleDemo;

import java.util.Random;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CheckWeatherDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		Random rand_value = new Random();
		
		// TODO Auto-generated method stub
		execution.setVariable("name", "Otho");
		execution.setVariable("weatherOK", rand_value.nextBoolean());
		
	}

}
