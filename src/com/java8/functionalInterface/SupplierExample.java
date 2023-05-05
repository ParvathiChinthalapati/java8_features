package com.java8.functionalInterface;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating Supplier
		Supplier<Integer> getCurrentDayOfMonth = () -> LocalDate.now().getDayOfMonth();
		//Invoking get method insdie supplier
		System.out.println("Today's day of the month is : "+getCurrentDayOfMonth.get());
		
		//Creating Supplier
		Supplier<String> getCurrentDay = () -> LocalDate.now().getDayOfWeek().name();
		//Invoking get method insdie supplier
		System.out.println("Today's day of the week is : "+getCurrentDay.get());
	}

}
