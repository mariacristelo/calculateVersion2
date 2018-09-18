package com.calculateVersion2.exercise.calculateVersion2.operations;


/** @Author : Maria Pereira
 *  @CalculateVersion2 - gets and sets
 *  @params - value1, value2, operation
 */

public class CalculateVersion2 {
	private double value1;
	private double value2;
	private String operation;
	
	public CalculateVersion2() {
		super();
	}
	
	public CalculateVersion2(double value1, double value2, String operation) {
		super();
		this.value1 = value1;
		this.value2 = value2;
		this.operation = operation;
	}

	public double getValue1() {
		return value1;
	}

	public void setValue1(double value1) {
		this.value1 = value1;
	}

	public double getValue2() {
		return value2;
	}

	public void setValue2(double value2) {
		this.value2 = value2;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}	
	
}
