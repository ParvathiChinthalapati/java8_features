package com.java8.functionalInterface;

import java.util.function.Function;

public class FunctionExample {
	public static void main(String args[]) {
		Function<String,String> convertStr = str -> str.toUpperCase();
		System.out.println("Uppercase of input String "+convertStr.apply("parvathi"));
		
		Function<String,String> sameValue = Function.identity();
		System.out.println("Same Value of input String "+sameValue.apply("hello"));
		
		//Multiply Operation
		Function<Integer,Integer> multiplyOperation = a ->{
			System.out.println("Double operation ");
			return a * 2;
		};
		
		//Chaining with function methods using andThen()
		multiplyOperation = multiplyOperation.andThen(a -> {
			System.out.println("Triplet Operation ");
			return a * 3;
		});
		
		System.out.println("Multiply Operation "+multiplyOperation.apply(3));
		
		//Division Operation
		Function<Integer,Integer> divisionOperation = a ->{
			System.out.println("Division by 2 operation ");
			return a / 2;
		};
		
		//Chaining the function method using compose
		divisionOperation = divisionOperation.compose(a -> {
			System.out.println("Division by 3 operation ");
			return a / 3;
		});
		
		System.out.println("Division Operation "+divisionOperation.apply(30));
	}

}
