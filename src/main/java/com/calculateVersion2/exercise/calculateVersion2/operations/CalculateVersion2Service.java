package com.calculateVersion2.exercise.calculateVersion2.operations;

import org.springframework.stereotype.Service;

@Service
public class CalculateVersion2Service {
	private CalculateVersion2Builder service;
	
	public void setCalculateVersion2Builder (CalculateVersion2Builder calc) {
		service = calc;
	}
	
	 public CalculateVersion2 getCalculateVersion2() {
	        return service.getCalculate();
	    }

	    public void constructPizza() {
	    	service.createNewCalculate();;
	    	service.Average();;
	    	service.Sum();
	    	service.Division();
	    	service.Multiplication();
	    	service.Subtraction();
	    }
	}
