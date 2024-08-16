package io.jacky.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListMain {
	public static void main(String[] args) {
		
		LinkedList<String> listOfPeople = new LinkedList<>();
		listOfPeople.add("Modi");
		listOfPeople.add("Biden");
		listOfPeople.add("Putin");
		listOfPeople.add("Xi");
		System.out.println(listOfPeople);
		
		listOfPeople.addFirst("Imran");
		System.out.println(listOfPeople);
		
		listOfPeople.addLast("Hasina");
		System.out.println(listOfPeople);
		
		
		ArrayList<String> secondList = new ArrayList<String>();
		secondList.add("Shankar");
		secondList.add("Ajit");
		secondList.add("Mamata");
		listOfPeople.addAll(3, secondList);
		System.out.println(listOfPeople);
		
		
		
		
		
	}
}
