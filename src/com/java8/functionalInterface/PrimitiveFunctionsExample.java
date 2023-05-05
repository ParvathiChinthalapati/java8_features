package com.java8.functionalInterface;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;

public class PrimitiveFunctionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problemsWithNormalFunctionalInterfaces();
		predicatePrimitveFunction();
		functionPrimitveFunction();
		biFunctionPrimitveFunction();
		consumerPrimitiveFunctions();
		supplierPrimitiveFunctions();
		unaryPrimitiveFunctions();
		binaryPrimitiveFunctions();
	}

	private static void binaryPrimitiveFunctions() {
		IntBinaryOperator intBinary = (a, b) -> a + b;
		System.out.println("Output from IntBinaryOperator is : " + intBinary.applyAsInt(24, 26));

		LongBinaryOperator longBinary = (a, b) -> a + b;
		System.out.println("Output from LongBinaryOperator is : " + longBinary.applyAsLong(247890, 447890));

		DoubleBinaryOperator doubleBinary = (a, b) -> a + b;
		System.out.println("Output from DoubleBinaryOperator is : " + doubleBinary.applyAsDouble(24.6, 87.9));
	}

	private static void unaryPrimitiveFunctions() {
		IntUnaryOperator intUnary = a -> a * 2;
		System.out.println("Output from IntUnaryOperator is : " + intUnary.applyAsInt(24));

		LongUnaryOperator longUnary = a -> a * 2;
		System.out.println("Output from LongUnaryOperator is : " + longUnary.applyAsLong(247890));

		DoubleUnaryOperator doubleUnary = a -> a * 2;
		System.out.println("Output from DoubleUnaryOperator is : " + doubleUnary.applyAsDouble(24.6));
	}

	private static void consumerPrimitiveFunctions() {
		IntConsumer intCons = a -> System.out.println("Output from IntConsumer : " + a);
		intCons.accept(10);

		DoubleConsumer doubleCons = a -> System.out.println("Output from DoubleConsumer : " + a);
		doubleCons.accept(10.0);

		LongConsumer longCons = a -> System.out.println("Output from LongConsumer : " + a);
		longCons.accept(123456);

		ObjIntConsumer<String> objIntCons = (input, a) -> System.out
				.println("Output from ObjectIntConsumer : " + input + a);
		objIntCons.accept("Ten", 10);

		ObjDoubleConsumer<String> objDoubleCons = (input, a) -> System.out
				.println("Output from ObjDoubleConsumer : " + input + a);
		objDoubleCons.accept("Ten", 10.0);

		ObjLongConsumer<String> objLongCons = (input, a) -> System.out
				.println("Output from objLongCons : " + input + a);
		objLongCons.accept("Thousand", 1000);
	}

	private static void supplierPrimitiveFunctions() {

		IntSupplier intSupp = () -> {
			Random random = new Random();
			return random.nextInt(1000);
		};
		System.out.println("Output from IntSupplier is : " + intSupp.getAsInt());

		DoubleSupplier doubleSupp = () -> {
			Random random = new Random();
			return random.nextDouble();
		};
		System.out.println("Output from DoubleSupplier is : " + doubleSupp.getAsDouble());

		LongSupplier longSupp = () -> {
			Random random = new Random();
			return random.nextLong();
		};
		System.out.println("Output from LongSupplier is : " + longSupp.getAsLong());

		BooleanSupplier boolSupplier = () -> LocalDate.now().isLeapYear();
		System.out.println("Output from BooleanSupplier is : " + boolSupplier.getAsBoolean());

	}

	private static void problemsWithNormalFunctionalInterfaces() {
		Function<Integer, Integer> doubleValue = input -> input * 2;

		int inArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int outArray[] = new int[inArray.length];

		for (int i = 0; i < inArray.length; i++) {
			outArray[i] = doubleValue.apply(inArray[i]);
		}
		// First input value provided will Convert into Integer and again each Integer
		// converted to int
		// during businness logic and converted back to Integer after business logic
		System.out.println("The Input Array is : " + Arrays.toString(inArray));
		System.out.println("The Output Array is : " + Arrays.toString(outArray));
	}

	private static void predicatePrimitveFunction() {
		IntPredicate checkInt = a -> a % 2 == 0;
		System.out.println("Output of Int Predicate : " + checkInt.test(10));

		DoublePredicate checkDouble = a -> a % 2 == 0;
		System.out.println("Output of Double Predicate : " + checkDouble.test(10.0));

		LongPredicate checkLong = a -> a % 2 == 0;
		System.out.println("Output of Long Predicate : " + checkLong.test(123456789));
	}

	private static void functionPrimitveFunction() {
		IntFunction<String> applyInt = a -> Integer.toString(a);
		System.out.println("Output from IntFunction is : " + applyInt.apply(10));

		DoubleFunction<String> applyDouble = a -> Double.toString(a);
		System.out.println("Output from DoubleFunction is : " + applyDouble.apply(10.0));

		LongFunction<String> applyLong = a -> Long.toString(a);
		System.out.println("Output from LongFunction is : " + applyLong.apply(123456789));

		ToIntFunction<String> toInt = a -> Integer.parseInt(a);
		System.out.println("Output from ToIntFunction is : " + toInt.applyAsInt("10"));

		ToDoubleFunction<String> toDouble = a -> Double.parseDouble(a);
		System.out.println("Output from ToDoubleFunction is : " + toDouble.applyAsDouble("10.0"));

		ToLongFunction<String> toLong = a -> Long.parseLong(a);
		System.out.println("Output from ToLongFunction is : " + toLong.applyAsLong("123456789"));

		IntToLongFunction intToLong = a -> (long) a;
		System.out.println("output from IntToLongFunction is: " + intToLong.applyAsLong(10));

		IntToDoubleFunction intToDouble = a -> (double) a;
		System.out.println("output from IntToDoubleFunction is: " + intToDouble.applyAsDouble(10));

		LongToDoubleFunction longToDouble = a -> (double) a;
		System.out.println("output from LongToDoubleFunction is: " + longToDouble.applyAsDouble(101234));

		LongToIntFunction longToInt = a -> (int) a;
		System.out.println("output from LongToIntFunction is: " + longToInt.applyAsInt(10));

		DoubleToIntFunction doubleToInt = a -> (int) a;
		System.out.println("output from DoubleToIntFunction is: " + doubleToInt.applyAsInt(10.0));

		DoubleToLongFunction doubleToLong = a -> (long) a;
		System.out.println("output from DoubleToLongFunction is: " + doubleToLong.applyAsLong(12345678.0));

	}

	private static void biFunctionPrimitveFunction() {
		ToIntBiFunction<String, String> toIntBiFunc = (input1, input2) -> {
			return (Integer.parseInt(input1) + Integer.parseInt(input2));
		};
		System.out.println("output from ToIntBiFunction is: " + toIntBiFunc.applyAsInt("10", "20"));

		ToLongBiFunction<String, String> toLongBiFunc = (input1, input2) -> {
			return (Long.parseLong(input1) + Long.parseLong(input2));
		};
		System.out.println("output from ToLongBiFunction is: " + toLongBiFunc.applyAsLong("1034567", "2034567"));

		ToDoubleBiFunction<String, String> toDoubleBiFunc = (input1, input2) -> {
			return (Double.parseDouble(input1) + Double.parseDouble(input2));
		};
		System.out.println("output from ToDoubleBiFunction is: " + toDoubleBiFunc.applyAsDouble("10.0", "20.0"));
	}
}
