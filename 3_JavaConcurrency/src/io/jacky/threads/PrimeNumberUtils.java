package io.jacky.threads;

public class PrimeNumberUtils {
	static int calculatePrime(int n) {
		int position = 0;
		boolean isPrime;
		int currentPrime = 2;
		for (int number = 2; n != position; number++) {
			isPrime = true;
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				position++;
				currentPrime = number;
			}
		}
		return currentPrime;
	}
}
