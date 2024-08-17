package io.jacky.wildcard;

import java.util.ArrayList;
import java.util.List;

public class WildCardUpperBound {

	public static void main(String[] args) {

		System.out.println("Checking List Runtime");
		List<String> namesList = new ArrayList<>();
		namesList.add("Lucky");
//		printsNumberList(namesList); // will give error as String does not extend string

		List<Integer> ageList = new ArrayList<>();
		ageList.add(32);
		ageList.add(23);
		System.out.println(printsNumberList(ageList));

		
		List<Float> heightList = new ArrayList<>();
		heightList.add(5.6f);
		heightList.add(6.1f);
		System.out.println(printsNumberList(heightList));
	}
	
	private static double printsNumberList(List<? extends Number> numbers) {
		double result = 0;
		for (Number number : numbers) {
			result  = result + number.doubleValue();
		}
		return result;
//		names.add("string");  // will give compile error as list used wildcard
	}
}
