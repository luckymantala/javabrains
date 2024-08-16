package io.jacky;

public class Primitives {

	
	public static void main(String[] args) {
		
		byte a = 2;
		short b = 10;
		int c = 490;
		long d = 342;
		float e = 331;
		var f = 23_24.2D;  // same as double f = 2323.2;
		char g = 's';
		boolean h = true;
		
//		type conversion    long is bigger then int so java automatically do type conversion
		long cc = c; 
		
		
//		type casting    int is smaller then long so need to type cast
		int dd = (int) d;
		
		/*
		 * int exp = a + b + (f * d); error 
		 * d and f are long and double and trying to store in int exp so we need to type cast
		 * the exp and then store in int or change int to biggest data type in the exp i.e. double
		 * 
		 */
		int exp1 = (int) (a + b + (f * d));
		System.out.println(exp1);
		double exp2 = a + b + (f * d);
		System.out.println(exp2);
		
	}
}
