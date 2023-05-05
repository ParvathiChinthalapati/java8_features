package com.java8.optionalClass;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalExample {
	public static void main(String args[]) {
		OptionalExample optional = new OptionalExample();
		optional.withJava8();
	}

	public void withJava8() {
		String[] str = new String[10];
		str[5] = "Easy Bytes";

		Optional<String> empty = Optional.empty();
		System.out.println(empty);

		Optional<String> value = Optional.of(str[5]);
		System.out.println(value.get());

		Optional<String> nullValue = Optional.ofNullable(str[4]);
		nullValue.ifPresent(System.out::println);
		System.out.println(nullValue.orElse("no value"));

		Optional<String> nonEmptyString = Optional.of("Eazy Bytes");
		Optional<String> emptyString = Optional.empty();

		System.out.println("Non-Empty Optional " + nonEmptyString.map(String::toUpperCase));
		System.out.println("Empty Optional " + emptyString.map(String::toUpperCase));

		Optional<Optional<String>> nonEmptyOptionalInput = Optional.of(Optional.of("Eazy Bytes"));
		System.out.println("Optional value " + nonEmptyOptionalInput);
		System.out.println("Optional.map " + nonEmptyOptionalInput.map(input -> input.map(String::toUpperCase)));
		System.out
				.println("Optional.flatMap " + nonEmptyOptionalInput.flatMap(input -> input.map(String::toUpperCase)));

		Optional<String> country = Optional.of("India");
		Optional<String> emptyCountry = Optional.empty();

		//Filter on Optional

		System.out.println(country.filter(g -> g.equals("India")));
		System.out.println(country.filter(g -> g.equalsIgnoreCase("India")));
		System.out.println(emptyCountry.filter(g -> g.equalsIgnoreCase("India")));

		if (country.isPresent())
			System.out.println("Value Available");

		country.ifPresent(c -> System.out.println("In Country Option value available is " + c));
		emptyCountry.ifPresent(c -> System.out.println("In Country Option value available is " + c));

		System.out.println(country.orElse("No country data available"));
		System.out.println(emptyCountry.orElse("No country data available"));
		System.out.println(emptyCountry.orElseGet(() -> "No country data available"));
		System.out.println(emptyCountry.orElseThrow(NoSuchElementException::new));

	}
}
