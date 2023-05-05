package com.java8.functionalInterface;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {

		Function<String,String> convertStr = str -> str.toUpperCase();
		System.out.println("Uppercase of input String using Function: "+convertStr.apply("parvathi"));
		
		UnaryOperator<String> convertStrUnary = str -> str.toUpperCase();
		System.out.println("Uppercase of input String using Unary: "+convertStrUnary.apply("parvathi"));
		
		UnaryOperator<String> sameValue = UnaryOperator.identity();
		System.out.println("Same Value of input String: "+sameValue.apply("hello"));
		
		//Multiply Operation
		Function<Integer,Integer> multiplyOperation = a ->{
			System.out.println("Double operation ");
			return a * 2;
		};
		
		UnaryOperator<Integer> unaryOperation = a ->{
			System.out.println("Triplet operation ");
			return a * 3;
		};
		
		//Chaining with function methods using andThen()
		multiplyOperation = multiplyOperation.andThen(unaryOperation);
		
		System.out.println("Multiply Operation: "+multiplyOperation.apply(3));
		
		//Division Operation
		Function<Integer,Integer> divisionOperation = a ->{
			System.out.println("Division by 2 operation: ");
			return a / 2;
		};
		
		//Chaining the function method using compose
		divisionOperation = divisionOperation.compose(multiplyOperation);
		
		System.out.println("Division Operation: "+divisionOperation.apply(30));
	
	}

}
