package com.calculateVersion2.exercise.calculateVersion2.operations;

abstract class CalculateVersion2Builder {
	protected CalculateVersion2 calculate;
	
	public CalculateVersion2 getCalculate() {
		return calculate;
	}
	
	public void createNewCalculate() {
		calculate = new CalculateVersion2();
	}
	
	public abstract void Average();
	public abstract void Sum();
	public abstract void Division();
	public abstract void Subtraction();
	public abstract void Multiplication();

}
