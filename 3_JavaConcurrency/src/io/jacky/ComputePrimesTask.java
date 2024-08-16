package io.jacky;

import java.util.concurrent.RecursiveTask;

public class ComputePrimesTask extends RecursiveTask<Integer> {

	private static final long serialVersionUID = 1L;
	
	int array[];
	int start;
	int end;

	public ComputePrimesTask(int[] array, int start, int end) {
		this.array = array;
		this.start = start;
		this.end = end;
	}

	@Override
	protected Integer compute() {
		
		if(start == end) {
			System.out.println(array[start] + ":" + PrimeNumberUtils.calculatePrime(array[start]));
			return PrimeNumberUtils.calculatePrime(array[start]);
		}
		if(end - start == 1) {
			System.out.print(array[start] + ":" + PrimeNumberUtils.calculatePrime(array[start]) + " + ");
			System.out.println(array[end] + ":" + PrimeNumberUtils.calculatePrime(array[end]));
			return PrimeNumberUtils.calculatePrime(array[start]) +
					PrimeNumberUtils.calculatePrime(array[end]);
		}
		
		int mid = (end + start) / 2;
		ComputePrimesTask subTask1 = new ComputePrimesTask(array, start, mid);
		ComputePrimesTask subTask2 = new ComputePrimesTask(array, mid + 1, end);
		invokeAll(subTask1, subTask2);
		return subTask1.join() + subTask2.join();
	}
}
