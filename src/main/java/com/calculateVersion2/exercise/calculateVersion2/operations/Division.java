package com.calculateVersion2.exercise.calculateVersion2.operations;

abstract class Division extends CalculateVersion2Builder {
	
	CalculateVersion2 values = new CalculateVersion2();
	public double getDivision() {
		return values.getValue1() / values.getValue2();
		
	}
}
