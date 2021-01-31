package com.camunda.demo.SimpleDemo;

import java.util.Random;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CheckTemperatureDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		
		Random rand_value = new Random();
		
		// TODO Auto-generated method stub
		execution.setVariable("temperature", rand_value.nextInt()%100);
	}

}
