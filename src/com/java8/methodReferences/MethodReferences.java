package com.java8.methodReferences;

import java.util.ArrayList;
import java.util.List;

import com.java8.lamdaExpression.ArithmeticOperation;

public class MethodReferences {

	public static void main(String[] args) {
		staticMethodReference();
		instanceMethodReference();
		instanceMethodWithClassName();
		constructorReference();
	}

	private static void constructorReference() {
		ProductInterface productUdingLambda = (name , price)-> new Product(name , price);
		Product prodSamsung = productUdingLambda.getProduct("Galaxy", 1000);
		System.out.println("Using lambda : "+prodSamsung.toString());
		
		ProductInterface prodInter = Product::new;
		Product consRef = prodInter.getProduct("Apple", 1200);
		System.out.println("Using constrcutor reference : "+consRef.toString());
	}

	private static void instanceMethodWithClassName() {
		List<String> list = new ArrayList<>();
		list.add("parvathi");
		list.add("surya");
		list.add("eshaan");
		list.forEach(s -> System.out.println(s));
		list.forEach(System.out::println);
	}

	private static void instanceMethodReference() {
		ArithmeticOperation operation = (a,b) -> {
			int sum = a+b;
			System.out.println("The sum of two numbers using Arthmetic Operation using Lambda is : "+sum);
			return sum;
		};
		operation.performOperation(4, 5);
		MethodReferences objRef = new MethodReferences();
		ArithmeticOperation instanceRef = objRef::performInstanceAddition;
		instanceRef.performOperation(9, 10);
	}
	public  int performInstanceAddition(int a, int b) {
		int sum = a+b;
		System.out.println("The sum of two numbers using Arthmetic Operation using instance method is : "+sum);
		return sum;
	}
	private static void staticMethodReference() {
		ArithmeticOperation operation = (a,b) -> {
			int sum = a+b;
			System.out.println("The sum of two numbers using Arthmetic Operation using Lambda is : "+sum);
			return sum;
		};
		operation.performOperation(4, 5);
		
		ArithmeticOperation methodRef = MethodReferences::performOperation;
		methodRef.performOperation(9, 10);
		
	}
public static int performOperation(int a, int b) {
	int sum = a+b;
	System.out.println("The sum of two numbers using Arthmetic Operation using static method is : "+sum);
	return sum;
}
}
