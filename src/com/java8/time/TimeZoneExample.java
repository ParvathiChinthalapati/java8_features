package com.java8.time;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.HijrahDate;

public class TimeZoneExample {

	public static void main(String[] args) {
		ZoneId india = ZoneId.of("Asia/Kolkata");
		ZonedDateTime indiaDateTime = ZonedDateTime.now(india);
		System.out.println("India Time "+indiaDateTime);
		
		ZonedDateTime minisottaDateTime = indiaDateTime.withZoneSameInstant(ZoneId.of("America/Chicago"));
		System.out.println("Minisotta Time "+minisottaDateTime);
		
		ZoneOffset zoneOffset = ZoneOffset.of("+05:30");
		OffsetDateTime offsetDateTime = OffsetDateTime.now(zoneOffset);
		
		System.out.println("Time in India now using offset  "+offsetDateTime);
		
		OffsetDateTime offsetDateTimeMN = offsetDateTime.withOffsetSameInstant(ZoneOffset.of("-06:00"));
		
		System.out.println("Time in MN now using offset  "+offsetDateTimeMN);
		
		ZonedDateTime dateTime1 = ZonedDateTime.now(ZoneId.of("America/New_York"));
		OffsetDateTime dateTime2 = OffsetDateTime.now(ZoneOffset.of("-05:00"));
		System.out.println(dateTime1);
		System.out.println(dateTime2);
		System.out.println(dateTime2.toEpochSecond() - dateTime1.toEpochSecond());
		
		ZonedDateTime dateTimePlus1 = dateTime1.plusMonths(6);
		OffsetDateTime dateTimePlus2 = dateTime2.plusMonths(6);
		System.out.println(dateTimePlus1);
		System.out.println(dateTimePlus2);
		System.out.println(dateTimePlus2.toEpochSecond() - dateTimePlus1.toEpochSecond());
		
		LocalDateTime ldt = LocalDateTime.of(2000, 6,16,12,30,0);
		ZonedDateTime parisZone = ldt.atZone(ZoneId.of("Europe/Paris"));
		System.out.println("Paris time "+parisZone);
		
		ZoneOffset asiaKolkata = ZoneOffset.of("+05:30");
		LocalDateTime dateTime = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45);
		OffsetDateTime dateTimeKolkata = OffsetDateTime.of(dateTime, asiaKolkata);
		System.out.println("Given Time in Kolkata "+dateTimeKolkata);
		
		HijrahDate todayIslamic = HijrahDate.now();
		System.out.println("Islamic date for today "+todayIslamic);
		
	}

}
