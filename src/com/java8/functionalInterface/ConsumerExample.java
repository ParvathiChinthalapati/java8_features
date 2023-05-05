package com.java8.functionalInterface;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating Consumer
		Consumer<String> convertAndDisplay = input -> System.out.println("Upper case of given String "+input.toUpperCase());
		
		//invoking accept method inside consumer
		convertAndDisplay.accept("parvathi");
		
		//Creating Consumer
		Consumer<String> appendInput = input -> System.out.println("New Value after append is : "+"Hello "+input);
		
		appendInput.andThen(convertAndDisplay).accept("Java 8");
	}

}
