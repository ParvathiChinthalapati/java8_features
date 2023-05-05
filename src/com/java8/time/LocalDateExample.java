package com.java8.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateExample {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2022,12,9);
		System.out.println("Given Date is "+date);
		int year = date.getYear();
		System.out.println("Year is "+year);
		Month month = date.getMonth();
		System.out.println("Month is "+month);
		int day= date.getDayOfMonth();
		System.out.println("Day is "+day);
		DayOfWeek dow = date.getDayOfWeek();
		System.out.println("Day of the week is "+dow);
		int len = date.lengthOfMonth();
		System.out.println("Length of the month is "+len);
		boolean leapYear = date.isLeapYear();
		System.out.println("Is a leap year ? "+leapYear);
		
		int year1 = date.get(ChronoField.DAY_OF_YEAR);
		System.out.println("Given Year is : "+year1);
		int month1 = date.get(ChronoField.MONTH_OF_YEAR);
		System.out.println("Given Month is : "+month1);
		int day1 = date.get(ChronoField.DAY_OF_WEEK);
		System.out.println("Given Day is : "+day1);
		
		LocalDate localDate = LocalDate.parse("1980-09-02");
		System.out.println("Parded date "+localDate);
		LocalDate today = LocalDate.now();
		System.out.println("Today's Date is "+today);
		
	}

}
