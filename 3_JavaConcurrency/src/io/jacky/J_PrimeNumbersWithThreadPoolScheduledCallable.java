package io.jacky;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class J_PrimeNumbersWithThreadPoolScheduledCallable {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		List<Future<Integer>> futures = new ArrayList<Future<Integer>>();

		ExecutorService executorService = Executors.newFixedThreadPool(3);

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the nth position you want to find prime number of : \n");
			int n = sc.nextInt();
			if (n == 0) {
				sc.close();
				System.out.println("Done calculating all primes");
				Iterator<Future<Integer>> iterator = futures.iterator();
				while (iterator.hasNext()) {
					Future<Integer> f = (Future<Integer>) iterator.next();
					if (f.isDone()) {
						System.out.println(f.get());
						iterator.remove();
					}
				}
				break;
			}
			Callable<Integer> c = () -> {
				return PrimeNumberUtils.calculatePrime(n);
			};

			Future<Integer> fut = executorService.submit(c);
			futures.add(fut);
		}
	}
}
