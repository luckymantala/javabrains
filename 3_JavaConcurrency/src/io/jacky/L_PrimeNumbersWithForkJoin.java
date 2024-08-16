package io.jacky;

import java.util.concurrent.ForkJoinPool;

public class L_PrimeNumbersWithForkJoin {

	
	int inputNumbers[] = {2,3,4,5,6,7,8,9,10};
	ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
	private void calculatedAllPrimesUsingForkJoinRecursiveTask() {
		ComputePrimesTask computePrimes = new ComputePrimesTask(inputNumbers, 0, inputNumbers.length - 1);
		Integer result = forkJoinPool.invoke(computePrimes);
		System.out.println("The sum of all primes: " + result);
	}
	
	private void incrementArrayUsingForkJoinRecursiveAction() {
		IncrementArrayAction computePrimes = new IncrementArrayAction(inputNumbers, 0, inputNumbers.length - 1);
		forkJoinPool.invoke(computePrimes);
		System.out.println("Array after increment: ");
		for (int i : inputNumbers) {
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Using RecursiveTask to caluclate primes and add all of them: ");
		new L_PrimeNumbersWithForkJoin().calculatedAllPrimesUsingForkJoinRecursiveTask();
		System.out.println("Using ResursiveAction to increment all elements of an array: ");
		new L_PrimeNumbersWithForkJoin().incrementArrayUsingForkJoinRecursiveAction();
	}
}
