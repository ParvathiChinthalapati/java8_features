package com.java8.functionalInterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorExapmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating BinaryOperator
		BinaryOperator<String> appendAndConvert = (input1,input2) -> (input1 + input2).toUpperCase();
		
		//calling BinaryOperator method
		appendAndConvert.apply("Hello", "parvathi");
		
		BinaryOperator<Integer> maxOperation = BinaryOperator.maxBy((a,b) -> (a > b) ? 1 : ((a==b)? 0 : -1));
		System.out.println("The Largest Number is : "+maxOperation.apply(9, 80));
		
		BinaryOperator<Integer> minOperation = BinaryOperator.minBy((a,b) -> (a > b) ? 1 : ((a==b)? 0 : -1));
		System.out.println("The Smallest Number is : "+minOperation.apply(9, 80));
	}

}
