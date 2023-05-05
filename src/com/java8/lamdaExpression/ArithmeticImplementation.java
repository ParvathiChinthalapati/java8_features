package com.java8.lamdaExpression;

public class ArithmeticImplementation {

	public static void main(String args[]) {
		int first = 9; int second = 6;
		ArithmeticOperation oldSum = new ArithmeticOperation() {
			public int performOperation(int a,int b) {
				return a + b;
			}
		};
		System.out.println("The sum of two integers without lambda "+oldSum.performOperation(first, second));
		ArithmeticOperation sum = (a,b) -> a+b;
		ArithmeticOperation mul = (a,b) -> a*b;
		ArithmeticOperation div = (a,b) -> a/b;
		System.out.println("The sum of two integers "+sum.performOperation(first, second));
		System.out.println("The mul of two integers "+mul.performOperation(first, second));
		System.out.println("The division of two integers "+div.performOperation(first, second));
	}
}
