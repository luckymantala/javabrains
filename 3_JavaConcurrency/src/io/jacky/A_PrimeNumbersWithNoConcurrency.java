package io.jacky;

import java.util.Scanner;

public class A_PrimeNumbersWithNoConcurrency {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the nth position you want to find prime number of : (0 - Exit)");
			int n = sc.nextInt();
			if(n==0) {
				System.out.println("Done calculating all primes");
				break;
			}
			System.out.println("Prime number of " + n + " position is " + PrimeNumberUtils.calculatePrime(n));
		}
	}
}
