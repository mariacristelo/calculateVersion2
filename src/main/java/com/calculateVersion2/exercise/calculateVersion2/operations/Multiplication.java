package com.calculateVersion2.exercise.calculateVersion2.operations;

abstract class Multiplication extends CalculateVersion2Builder {
	
	CalculateVersion2 values = new CalculateVersion2();
	public double getAverage() {
		return values.getValue1() * values.getValue2();
		
	}
}
