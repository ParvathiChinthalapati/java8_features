package com.java8.lamdaExpression;

public class LamdaExamples {
	public static void main(String args[]) {
		voidMethodWithNoParams();
		voidMethodWithOneParams();
		voidMethodWithTwoParams();
		returnMethodWithTwoParams();
	}

	private static void voidMethodWithNoParams() {

		VoidMethodWithNoParams method = () -> {
			System.out.println("Method with no return type no input params");
		};

		VoidMethodWithNoParams method2 = () -> System.out.println("Ignoring {} since we have only one line of code ");
		method.printHello();
		method2.printHello();
	}
	
	private static void voidMethodWithOneParams() {

		VoidMethodWithOneParam method = (name) -> {
			System.out.println(name);
		};

		VoidMethodWithOneParam method2 = name -> System.out.println(name);
		method.printInput("Parvathi");
		method2.printInput("Surya");
	}
	
	private static void voidMethodWithTwoParams() {

		VoidMethodWithTwoParams addition = (a,b) -> {
		System.out.println(a +  b);
		
		};
		addition.calculateAndPrint(5, 2);
		
		VoidMethodWithTwoParams multiplication = (a, b) -> System.out.println(a * b);
		multiplication.calculateAndPrint(7, 8);
	}
	
	private static void returnMethodWithTwoParams() {

	ReturnMethodWithTwoParams multiply = (a, b) -> a * b;
	System.out.println(multiply.calculateAndReturn(7, 10));
	
	ReturnMethodWithTwoParams addition = (a, b) -> a + b;
	System.out.println(addition.calculateAndReturn(8, 10));
	
	ReturnMethodWithTwoParams division = (a, b) -> a / b;
	System.out.println(division.calculateAndReturn(15, 3));
	}
}
