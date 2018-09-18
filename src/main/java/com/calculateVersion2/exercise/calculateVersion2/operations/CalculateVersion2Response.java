package com.calculateVersion2.exercise.calculateVersion2.operations;

import java.util.Date;

public class CalculateVersion2Response {
	private double result;
	private Date time;
	
	public CalculateVersion2Response() {
		super();
	}
	
	public CalculateVersion2Response(double result, Date time) {
		super();
		this.result = result;
		this.time = time;
	}
	
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	
}
