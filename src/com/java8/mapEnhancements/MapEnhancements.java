package com.java8.mapEnhancements;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapEnhancements {

	public static void main(String[] args) {
		mapEnhancements();
	}

	private static void mapEnhancements() {
		Map<String,String> map = new HashMap<>();
		map.put("India", "Delhi");
		map.put("USA", "Washington");
		map.put("UK", "canada");
		map.put("Chaina", "Bejing");
		map.put("Japan", "Tokya");
		map.put("Germany", "Berlin");
		map.put("England", "Landon");
		
		map.forEach((country,capital) -> System.out.println("The Capital of "+country+" is "+capital));
		map.entrySet().stream().sorted(Entry.comparingByKey()).forEachOrdered(System.out::println);
		map.entrySet().stream().sorted(Entry.comparingByValue()).forEachOrdered(System.out::println);
		System.out.println("map getDefault "+map.getOrDefault("Russia", "No value present"));
		map.computeIfAbsent("Spain", name -> "Madrid");
		map.computeIfPresent("USA", (key,value) -> "Washington DC");
		map.compute("India", (k,v)->"new"+v);
		map.remove("England","London");
		map.replace("India", "Delhi");
		map.replaceAll((country,capital) -> capital.toUpperCase());
		map.entrySet().stream().sorted(Entry.comparingByValue()).forEachOrdered(System.out::println);
	}

}
