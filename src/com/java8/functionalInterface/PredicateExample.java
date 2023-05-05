package com.java8.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
	
	public static void main(String args[]) {
		//Creating predicate
		Predicate<Integer> isEven = n -> n % 2 == 0;
		
		//calling predicate method
		System.out.println("is the number 61 is Even "+isEven.test(61));
		
		//Creating predicate
		Predicate<Integer> isGreaterThan50 = n -> n > 50;
		
		//Predicate AND Chaining
		System.out.println("Is 61 is even & greater than 50 "+isGreaterThan50.and(isEven).test(61));
		
		//Predicate  OR Chaining
		System.out.println("Is 61 is even or greater than 50 "+isGreaterThan50.or(isEven).test(61));
		
		//Predicate negate Chaining
		System.out.println("Is 61 is odd "+isEven.negate().test(61));
		
		//Usage of predicate with streams & collections
		
		List<Integer> numberList = Arrays.asList(1,2,4,6,8,5,9);
		
		List<Integer> evenList = numberList.stream().filter(isEven).collect(Collectors.toList());
		
		System.out.println("List of even numbers from the list "+evenList);
		
		Predicate<String> checkEquality = Predicate.isEqual("Eazy Bytes");
		System.out.println("Is the Input String Equal "+checkEquality.test("Easy Bytes"));
		
	}
	
	

}
