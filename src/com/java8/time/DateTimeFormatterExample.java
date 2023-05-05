package com.java8.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.of(2000, 6,16);
		String baseISO = date.format(DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(baseISO);
		String localISO = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(localISO);
		
		LocalDate baseISODate = LocalDate.parse("20220209",DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(baseISODate);
		LocalDate localISODate = LocalDate.parse("2021-02-09",DateTimeFormatter.ISO_DATE);
		System.out.println(localISODate);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localDate = LocalDate.of(2010, 6,16);
		String formattedDate = localDate.format(formatter);
		System.out.println(formattedDate);
		
		DateTimeFormatter germanFormatter = DateTimeFormatter.ofPattern("d. MMM yyyy",Locale.GERMAN);
		LocalDate date1 = LocalDate.of(2008, 6,16);
		String formattedDateGer = date1.format(germanFormatter);
		System.out.println(formattedDateGer);
	}

}
