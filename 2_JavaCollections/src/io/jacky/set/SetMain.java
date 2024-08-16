package io.jacky.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetMain {
	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		names.add("Lucky");
		names.add("Akash");
		names.add("Chetan");
		
		System.out.println(names);
		names.add("Lucky");
		System.out.println(names);

		System.out.println(names.contains("Lucky"));
		System.out.println(names.remove("Chetan"));
		System.out.println(names);
		
		String firstNames[] = new String[10];
		firstNames[0] = "Tejas";
		firstNames[3] = "Raju";
		firstNames[6] = "Raj";
//		convert array to collection object
		List<String> fNames = Arrays.asList(firstNames);
		
		names.addAll(fNames);
		System.out.println(names);
		
//		LinkedHashSet
		Set<String> names1 = new LinkedHashSet<String>();
		names1.add("Lucky");
		names1.add("Akash");
		names1.add("Chetan");
		
		System.out.println(names1);
		names1.add("Lucky");
		System.out.println(names1);

		System.out.println(names1.contains("Lucky"));
		System.out.println(names1.remove("Chetan"));
		System.out.println(names1);
		
		String firstNames1[] = new String[10];
		firstNames1[0] = "Tejas";
		firstNames1[3] = "Raju";
		firstNames1[6] = "Raj";
//		convert array to collection object
		List<String> fNames1 = Arrays.asList(firstNames1);
		
		Collections.addAll(names1, "Vivek");
//		names1.addAll(fNames1, "Vivek");
		System.out.println(names1);
		
	}
}
