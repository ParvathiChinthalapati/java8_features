package com.java8.lamdaExpression;

public class AnonymousVsLamdaExpression {
	int sum = 0;

	public void sum() {
		int sum = 0;
		ArithmeticOperation ops = (a, b) -> {
			this.sum = a + b;
			System.out.println("The value is inside lamda expression" + sum);
			return this.sum;
		};
		System.out.println("Sum of 2 numbers is : " + ops.performOperation(8, 9));
	}

	public static void main(String args[]) {
		AnonymousVsLamdaExpression ale = new AnonymousVsLamdaExpression();
		ale.sum();
	}
}
