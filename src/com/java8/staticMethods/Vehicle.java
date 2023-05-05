package com.java8.staticMethods;

public interface Vehicle {
	public int vehicleSpeed();
	public void applyBreaks();
	public default void autoPilot()
	{
		System.out.println("This is default Auto Pilot mode");
	}
	public static void sayHello() {
		System.out.println("This is Honda company from Interface ");
	}
}
