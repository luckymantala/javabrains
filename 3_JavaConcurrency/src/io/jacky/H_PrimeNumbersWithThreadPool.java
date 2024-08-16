package io.jacky;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class H_PrimeNumbersWithThreadPool {
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(3);
//		ExecutorService executorService = Executors.newCachedThreadPool();
//		ExecutorService executorService = Executors.newSingleThreadExecutor();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the nth position you want to find prime number of : \n");
			int n = sc.nextInt();
			if (n == 0) {
				System.out.println("Done calculating all primes");
				break;
			}
			Runnable r = new Runnable() {
				@Override
				public void run() {
					System.out.println("Prime number of " + n + " position is " + PrimeNumberUtils.calculatePrime(n));
				}
			};
			executorService.execute(r);
		}
	}

}
