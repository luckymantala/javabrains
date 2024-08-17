package io.jacky.wildcard;

import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {

	private static int i = 0;

	public static void main(String[] args) {

		System.out.println("Checking List Runtime");
		List<String> namesList = new ArrayList<>();
		namesList.add("Lucky");
		printsAnyList(namesList);
		
		List<Integer> ageList = new ArrayList<>();
		ageList.add(32);
		ageList.add(23);
		printsAnyList(ageList);

	}

	
	
	
	/*
	 * if we use wildcard (?), then we can pass list 
	 * of any type to read the data
	 * from list but we cannot update list
	 */
	private static void printsAnyList(List<?> names) {
		names.forEach(System.out::println);
//		names.add("string");  // will give compile error as list used wildcard
	}
}
