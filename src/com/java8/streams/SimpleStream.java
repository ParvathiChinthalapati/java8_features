package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SimpleStream {
	public static void main(String args[]) {
	List<String> deptList = new ArrayList<>();
	deptList.add("Parvathi");
	deptList.add("Surya");
	deptList.add("Eshaan");
	deptList.add("Third Person");
	
	Stream<String> deptStream = deptList.stream();
	deptStream.forEach(System.out::println);
	
	Stream<String> inStream = Stream.of("java","springboot","restapi");
	inStream.forEach(System.out::println);
	
	Stream<String> parallelStream = deptList.parallelStream();
	parallelStream.forEach(System.out::println);
	
	Stream<String> emptyStream = Stream.empty();
	emptyStream.forEach(System.out::println);
	}
}
