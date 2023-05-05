package com.java8.defaultMethods;

public class Honda implements Vehicle{

	public static void main(String[] args) {
		Honda honda = new Honda();
		Honda.sayHello();
		honda.applyBreaks();
		honda.vehicleSpeed();

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
