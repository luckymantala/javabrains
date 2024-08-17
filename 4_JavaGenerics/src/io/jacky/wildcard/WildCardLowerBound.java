package io.jacky.wildcard;

import java.util.ArrayList;
import java.util.List;

public class WildCardLowerBound {

	public static void main(String[] args) {
		System.out.println("Checking List Runtime");
		List<String> namesList = new ArrayList<>();
		namesList.add("Lucky");
//		printsNumberList(namesList); // will give error as String does not extend string

		List<Integer> integers = new ArrayList<>();
		integers.add(32);
		integers.add(23);
		System.out.println(printsNumberList(integers));

		List<Float> floats = new ArrayList<>();
		floats.add(5.6f);
		floats.add(6.1f);
		System.out.println(printsNumberList(floats));

		List<Number> numbers = new ArrayList<>();
		numbers.add(54);
		numbers.add(6.1);
		numbers.add(6.1f);
		numbers.add(6.1d);
		System.out.println(printsNumberList(numbers));

		addToList(numbers, 12f);
//		addToList(integers, 12f);
//		addToList(floats, 12f);

	}

	private static void addToList(List<? super Number> numbers, Number number) {
		numbers.add(number);
	}

	private static double printsNumberList(List<? extends Number> numbers) {
		double result = 0;
		for (Number number : numbers) {
			result = result + number.doubleValue();
		}
		return result;
//		names.add("string");  // will give compile error as list used wildcard
	}
}
