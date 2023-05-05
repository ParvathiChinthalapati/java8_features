package com.java8.staticMethods;

public class Honda implements Vehicle{

	public static void main(String[] args) {
		Honda honda = new Honda();
		Honda.sayHello();
		honda.applyBreaks();
		honda.vehicleSpeed();
		Vehicle.sayHello();

	}

	@Override
	public int vehicleSpeed() {
		return 100;
		
	}

	@Override
	public void applyBreaks() {
		System.out.println("Vehicle speed applied ");
		
	}
	private static void sayHello() {
	System.out.println("This is Honda company");
}
}
