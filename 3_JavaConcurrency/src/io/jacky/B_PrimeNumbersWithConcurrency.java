package io.jacky;

import java.util.Scanner;

public class B_PrimeNumbersWithConcurrency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the nth position you want to find prime number of : \n");
			int n = sc.nextInt();
			if (n == 0) {
				sc.close();
				System.out.println("Done calculating all primes");
				break;
			}
			Runnable r = new Runnable() {
				@Override
				public void run() {
					System.out.println("Prime number of " + n + " position is " + PrimeNumberUtils.calculatePrime(n));
				}
			};
			Thread calculatePrime = new Thread(r);
			calculatePrime.start();
		}
	}
}
