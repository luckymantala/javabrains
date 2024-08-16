package io.jacky.arrays;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a[] = new int[10];
		
		for(int i=0; i<a.length; i++) {
			a[i] = i*10;
			System.out.println(i*10);
		}
		
		Integer b[] = {1,2,3,4,5,6};
		
		System.out.println(a);
		System.out.println(b);
		
		Car vista[] = new Car[10];
		vista[0] = new Car();
		
		int result = Arrays.binarySearch(a, 0);
		List<Integer> c = Arrays.asList(b);
		System.out.println(result);
		
		System.out.println(c.get(2));
		
		
		
		System.out.println("/////////////////////////////");
		Integer d[] = {1,2,3,4,5,6};
		int num = 10;
		for(int i=0; i<d.length; i++) {
			System.out.print(d[i]+" ");
		}
		System.out.println();
		System.out.println(num);
		
		/*
		 * java is call by value always In below method num value and d whic is an array
		 * object so its value which is a reference to the array is passed by so if we
		 * update d array in the method, original array will get updated as reference is
		 * passed
		 */
		updateArray(d, num);
		System.out.println(num);
		for(int i=0; i<d.length; i++) {
			System.out.print(d[i]+" ");
		}

	}
	
	
	static void updateArray(Integer[] d, int num) {
		d[2] = 10;
		num = 0;
	}
}
class Car {
	String color;
	int price;
}
