package com.java8.time;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class InstantClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instant instant = Instant.ofEpochSecond(6);
		System.out.println(instant);
		System.out.println(Instant.ofEpochSecond(4,1_000));
		System.out.println(Instant.ofEpochSecond(4,-1_000));
		Instant instantNow = Instant.now();
		System.out.println(instantNow);
		
		Duration instanceDuration = Duration.between(instant, instantNow);
		System.out.println("instanceDuration "+instanceDuration);
		
		LocalDateTime dateTime1 = LocalDateTime.of(1988, Month.JANUARY, 11, 16, 02, 45, 23);
		LocalDateTime dateTime2 = LocalDateTime.of(2020, Month.DECEMBER, 12, 06, 12, 45, 23);
		
		Duration dateTimeDuration = Duration.between(dateTime1, dateTime2);
		System.out.println("dateTimeDuration "+dateTimeDuration);
		
		LocalDate date1 = LocalDate.of(1988, 12, 21);
		LocalDate date2 = LocalDate.of(2023, 02, 9);
		Period localDatePeriod = Period.between(date1, date2);
		System.out.println("Period between "+localDatePeriod);
		
	}

}
