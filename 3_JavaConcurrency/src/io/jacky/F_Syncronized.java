package io.jacky;

class Counter implements Runnable {
	private int value = 0;
	public void increment() {
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		++value;
	}
	public void decrement() {
		--value;
	}
	public int getValue() {
		return value;
	}

//	private Integer i = 10;

	@Override
	public void run() {
//		synchronized (i) {
//			this.increment();
//			System.out.println(Thread.currentThread().getName() + " increments " + this.getValue());
//			this.decrement();
//			System.out.println(Thread.currentThread().getName() + " decrements " + this.getValue());
//		}
		synchronized (this) {
			this.increment();
			System.out.println(Thread.currentThread().getName() + " increments " + this.getValue());
			this.decrement();
			System.out.println(Thread.currentThread().getName() + " decrements " + this.getValue());
		}
	}
}
public class F_Syncronized {
	public static void main(String[] args) {
		
		Counter counter1 = new Counter();
		new Thread(counter1, "Counter1 One").start();
		new Thread(counter1, "Counter1 Two").start();
		new Thread(counter1, "Counter1 Three").start();
		new Thread(counter1, "Counter1 Four").start();
		
		Counter counter2 = new Counter();
		new Thread(counter2, "Counter2 One").start();
		new Thread(counter2, "Counter2 Two").start();
	}
}
