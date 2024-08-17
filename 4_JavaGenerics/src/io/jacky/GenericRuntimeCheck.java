package io.jacky;

import java.util.ArrayList;
import java.util.List;

public class GenericRuntimeCheck {
	
	private static int i = 0;
	
	public static void main(String[] args) {
		try {
			System.out.println("Checking List Runtime");
			List<String> namesList = new ArrayList<String>();
			addToNamesList(namesList, "Name 1");
			addToNamesList(namesList, "Name 2");
			System.out.println(namesList);
			incorrrectAddToList(namesList, 100);
			System.out.print("Fetching value from the list : ");
			String nameFromList = namesList.get(2);
			System.out.println(nameFromList);
		} catch (Exception e) {
			System.out.println("Exeption : " + e.getMessage());
		}
		
		try {
			System.out.println("Checking Array Runtime");
			String[] namesArray = new String[5];
			addToNamesArray(namesArray, "Name 1");
			addToNamesArray(namesArray, "Name 2");
			System.out.println(namesArray[0]);
			incorrectAddToArray(namesArray, 10);
			System.out.print("Fetching value from the array : ");
			String nameFromArray = namesArray[2];
			System.out.println(nameFromArray);
		} catch (Exception e) {
			System.out.println("Exeption : " + e.getMessage());
		}
	}

	private static void incorrectAddToArray(Object[] namesArray, int n) {
		System.out.print("Assigining value to array : ");
		namesArray[i++] = n;
	}

	private static void addToNamesArray(String[] namesArray, String name) {
		namesArray[i++] = name;
	}

	private static void incorrrectAddToList(List names, int i) {
		System.out.println("Assigining value to list : ");
		names.add(i);
	}

	private static void addToNamesList(List names, String name) {
		names.add(name);
	}
}
