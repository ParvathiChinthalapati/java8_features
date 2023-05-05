package com.java8.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2022, 12, 9);
		LocalTime time = LocalTime.of(3, 40, 20);
		LocalDateTime dateTime = LocalDateTime.of(2022, Month.JANUARY, 11, 16, 02, 45, 23);
		System.out.println("The Given Date Time is " + dateTime);
		LocalDateTime dateTimeVal = LocalDateTime.of(date, time);
		System.out.println(" Given Time : " + dateTimeVal + " \n year : " + dateTimeVal.getYear() + "\n month : "
				+ dateTimeVal.getMonth() + " \n dayOfMonth : " + dateTimeVal.getDayOfMonth() + " \n dayOfWeek : "
				+ dateTimeVal.getDayOfWeek() + "\n dayOfYear : " + dateTimeVal.getDayOfYear() + " \n getHour : "
				+ dateTimeVal.getHour() + " \n getMinutes : " + dateTimeVal.getMinute() + "\n getSeconds : "
				+ dateTimeVal.getSecond() + " \n getNanoSeconds : " + dateTimeVal.getNano() + " \n isAfter : "
				+ dateTimeVal.isAfter(dateTime) + "\n isBefore : " + dateTimeVal.isBefore(dateTime) + " \n isEqual : "
				+ dateTimeVal.isEqual(dateTime) + " \n minusYears " + dateTimeVal.minusYears(12) + " \n minusWeeks : "
				+ dateTimeVal.minusWeeks(3) + " \n minusDays : " + dateTimeVal.minusDays(20) + " \n minusHours : "
				+ dateTimeVal.minusHours(20) + " \n minusMinutes " + dateTimeVal.minusMinutes(20) + " \n minusSeconds "
				+ dateTimeVal.minusSeconds(20));
		
		LocalDate dateLocal = dateTimeVal.toLocalDate();
		System.out.println("The Given Time Value is "+dateLocal);
		LocalTime timeLocal = dateTimeVal.toLocalTime();
		System.out.println("The Given date value is "+timeLocal);
	}

}
