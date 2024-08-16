package io.jacky;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class I_PrimeNumbersWithThreadPoolScheduled {
	public static void main(String[] args) {

		ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

		Runnable statusReporter = () -> {
			System.out.println("Threads report");
			System.out.println("Active Threads : " + executorService.getActiveCount());
			System.out.println("Active Threads : " + executorService.getCompletedTaskCount());
		};
		scheduledExecutorService.scheduleAtFixedRate(statusReporter, 1, 5, TimeUnit.SECONDS);

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the nth position you want to find prime number of : \n");
			int n = sc.nextInt();
			if (n == 0) {
				sc.close();
				System.out.println("Done calculating all primes");
				break;
			}
			Runnable r = () -> {
				System.out.println("Prime number of " + n + " position is " 
						+ PrimeNumberUtils.calculatePrime(n));
			};
			executorService.execute(r);
		}
	}
}
