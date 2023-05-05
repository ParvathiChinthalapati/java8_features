package com.java8.time;

import java.time.LocalTime;

public class LocalTimeExample {
	
	public static void main(String args[]) {
		LocalTime time = LocalTime.of(3, 40,20);
		int hour = time.getHour();
		int minutes = time.getMinute();
		int seconds = time.getSecond();
		
		System.out.println("Given time : "+time+" hours : "+hour+" minutes : "+minutes+" seconds : "+seconds);
		
		LocalTime parseTime = LocalTime.parse("12:30:45");
		System.out.println("Parsed Time : "+parseTime);
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time : "+currentTime);
	}

}
