package io.jacky;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class K_PrimeNumbersWithSemaphores {
	public static void main(String[] args) {
		
		Semaphore semaphore = new Semaphore(3);
		
		// if want to execute the thread which was in queue first
//		Semaphore semaphore = new Semaphore(3, true);
		
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
					try {
						semaphore.acquire();
//						semaphore.acquireUninterruptibly();  if thread is uninterrupted then only acquire the lock
						System.out.println("Prime number of " + n + " position is " + PrimeNumberUtils.calculatePrime(n));
					} catch (InterruptedException e) {
						System.out.println("InterruptedException");
					} finally {
						semaphore.release();
					}
				}
			};
			Thread calculatePrime = new Thread(r);
			calculatePrime.start();
		}
	}
}
