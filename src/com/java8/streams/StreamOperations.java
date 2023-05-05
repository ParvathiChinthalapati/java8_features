package com.java8.streams;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java8.methodReferences.Product;

public class StreamOperations {

	public static void main(String[] args) {
		mapInStreams();
		flatMapInStreams();
		filterInStreams();
		limitInStreams();
		skipInStreams();
		traverseOnceInStreams();
		reduceInStreams();
		collectStreams();
		collectingAndThenStream();
		groupByStreams();
		partioningByStreams();
		streamsPipeLine();
		parallelStream();
	}

	private static void mapInStreams() {
		List<String> deptList = new ArrayList<>();
		deptList.add("Computers");
		deptList.add("Machanical");
		deptList.add("Electronics");
		deptList.add("Civil");

		deptList.stream().map(word -> word.toUpperCase()).forEach(System.out::println);
	}

	private static void flatMapInStreams() {
		String[] strArray = { "First", "Second" };
		Stream<String> streamOfWords = Arrays.stream(strArray);

		Stream<String[]> streamOfLetters = streamOfWords.map(word -> word.split(""));
		streamOfLetters.flatMap(Arrays::stream).forEach(System.out::println);

		List<List<String>> list = Arrays.asList(Arrays.asList("word1"), Arrays.asList("word2"));
		System.out.println(list);
		list.stream().map(Collection::stream).forEach(System.out::println);
		list.stream().flatMap(Collection::stream).forEach(System.out::println);
	}

	private static void filterInStreams() {
		List<String> deptList = new ArrayList<>();
		deptList.add("Computers");
		deptList.add("Machanical");
		deptList.add("Civil");
		deptList.add("Electronics");
		deptList.add("Civil");
		deptList.add("Computers");

		// Applying filter on stream
		Stream<String> deptStream = deptList.stream();
		deptStream.filter(dept -> dept.startsWith("C")).forEach(System.out::println);

		// Using distinct Operation on streams
		System.out.println("Distinct Elements of List");
		Stream<String> distStream = deptList.stream();
		distStream.distinct().forEach(System.out::println);

		// Using sorting operation on streams
		System.out.println("Sort Elements of List");
		Stream<String> sortStream = deptList.stream();
		sortStream.sorted().forEach(System.out::println);
	}

	private static void limitInStreams() {
		Stream.generate(new Random()::nextInt).limit(10).forEach(System.out::println);
	}

	private static void skipInStreams() {
		Stream.iterate(1, n -> n + 1).skip(10).limit(10).forEach(System.out::println);
	}

	private static void traverseOnceInStreams() {
		try {
			List<String> deptList = new ArrayList<>();
			deptList.add("Computers");
			deptList.add("Machanical");
			deptList.add("Civil");
			deptList.add("Electronics");
			deptList.add("Civil");
			deptList.add("Computers");
			
			Stream<String> deptStream = deptList.stream();
			deptStream.forEach(System.out::println);
			deptStream.forEach(System.out::println);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	private static void reduceInStreams() {
		System.out.println(Stream.iterate(1, n -> n + 1).limit(20).reduce(0, (a,b) -> a + b));
	}
	
	private static void collectStreams() {
		
		List<String> deptList = new ArrayList<>();
		deptList.add("Computers");
		deptList.add("Machanical");
		deptList.add("Electronics");
		deptList.add("Civil");
		
		List<String> finalList = deptList.stream().filter(n -> n.startsWith("C")).collect(Collectors.toList());
		finalList.forEach(System.out::println);
		
	}
	
	private static void collectingAndThenStream() {
		
		List<Product> productList = Arrays.asList(new Product("Apple",1200),new Product("Samsung",1100),new Product("Mi",800),
				new Product("oppo",400),new Product("NOKIA",500));
		
		String maxProductPrice = productList.stream().collect(
				Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Product::getPrice)), (Optional<Product> product) -> product.isPresent() ?product.get().getName():"None"));
		System.out.println("The Product with max price tag is "+maxProductPrice);
		
	}
	
	private static void groupByStreams() {
		
		List<Product> productList = Arrays.asList(new Product("Apple",1200),new Product("Samsung",1100),new Product("Mi",800),
				new Product("oppo",400),new Product("NOKIA",500));
		
		Map<String, List<Product>> priceMap = productList.stream().collect(Collectors.groupingBy(Product::getName));
		System.out.println("Price Map of products "+priceMap);
		
	}
	
	private static void partioningByStreams() {
		
		List<Product> productList = Arrays.asList(new Product("Apple",1200),new Product("Samsung",1100),new Product("Mi",800),
				new Product("oppo",400),new Product("NOKIA",500));
		
		Map<Boolean, List<Product>> priceMap = productList.stream().collect(Collectors.partitioningBy(product -> product.getPrice() > 500));
		System.out.println("Price Map of products "+priceMap);
		
		List<Product> lowPriceProducts = priceMap.get(false);
		List<Product> highPriceProducts = priceMap.get(true);
		
		System.out.println("Low Price Map of products "+lowPriceProducts);
		System.out.println("High Price Map of products "+highPriceProducts);
	}
	
	private static void streamsPipeLine() {
		
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(9);
		list.add(6);
		list.add(5);
		list.add(7);
		list.add(3);
		
		List<Integer> streamPipelineList = list.stream().filter(n -> n % 2 != 0).map(num -> num * num).sorted().collect(Collectors.toList());
		System.out.println("final list "+streamPipelineList);
		
	}
	
	private static void parallelStream() {
		
		List<String> deptList = new ArrayList<>();
		deptList.add("Computers");
		deptList.add("Machanical");
		deptList.add("Electronics");
		deptList.add("Civil");
		System.out.println("Normal Stream ");
		deptList.stream().forEach(System.out::println);
		System.out.println("parallel Stream ");
		deptList.parallelStream().forEach(System.out::println);
		
	}
}
