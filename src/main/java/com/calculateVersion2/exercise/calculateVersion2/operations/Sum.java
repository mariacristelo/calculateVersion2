package com.calculateVersion2.exercise.calculateVersion2.operations;

abstract class Sum extends CalculateVersion2Builder {
	CalculateVersion2 values = new CalculateVersion2();
	public double getSum() {
		return values.getValue1() + values.getValue2();
		
	}
}
