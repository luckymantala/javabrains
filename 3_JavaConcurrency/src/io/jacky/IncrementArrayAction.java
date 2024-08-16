package io.jacky;

import java.util.concurrent.RecursiveAction;

public class IncrementArrayAction extends RecursiveAction{

	int array[];
	int start;
	int end;

	public IncrementArrayAction(int[] array, int start, int end) {
		this.array = array;
		this.start = start;
		this.end = end;
	}

	@Override
	protected void compute() {
		if(start == end) {
			array[start]++;
			return;
		}
		if(end - start == 1) {
			array[start]++;
			array[end]++;
			return;
		}
		int mid = (end + start) / 2;
		IncrementArrayAction subTask1 = new IncrementArrayAction(array, start, mid);
		IncrementArrayAction subTask2 = new IncrementArrayAction(array, mid + 1, end);
		invokeAll(subTask1, subTask2);
	}
}
