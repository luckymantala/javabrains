package io.jacky;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E_PrimeNumbersWithConcurrencyJoining {
	public static void main(String[] args) {

		List<Thread> threads = new ArrayList<Thread>();

		Runnable statusReporter = new Runnable() {
			@Override
			public void run() {
				try {
					while (true) {
						Thread.sleep(5000);
						printThreads(threads);
					}
				} catch (InterruptedException e) {
					System.out.println("InterruptedException");
				}
			}
		};

		Thread reporterThread = new Thread(statusReporter);
		reporterThread.setDaemon(true);
		reporterThread.start();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the nth position you want to find prime number of : \n");
			int n = sc.nextInt();
			if (n == 0) {
				sc.close();
				reporterThread.interrupt();
				try {
					System.out.println("Waiting for all threads to end...");
					waitForThreads(threads);
					System.out.println("Done calculating " + threads.size() + " primes");
				} catch (InterruptedException e) {
					System.out.println("Something inturupted the thread...");
				}
				break;
			}
			Runnable r = new Runnable() {
				@Override
				public void run() {
					System.out.println("Prime number of " + n + " position is " + PrimeNumberUtils.calculatePrime(n));
				}
			};
			Thread calculatePrime = new Thread(r);
			threads.add(calculatePrime);
			calculatePrime.start();
		}
	}

	public static void waitForThreads(List<Thread> threads) throws InterruptedException {
		for (Thread thread : threads) {
			thread.join();
		}
	}

	public static void printThreads(List<Thread> threads) {
		for (Thread thread : threads) {
			System.out.print(thread.getState() + " ");
		}
		System.out.println();
	}
}
