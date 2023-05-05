package com.java8.defaultMethods;

public interface Vehicle {
	public int vehicleSpeed();
	public void applyBreaks();
	public default void autoPilot()
	{
		System.out.println("This is default Auto Pilot mode");
	}
	
}
