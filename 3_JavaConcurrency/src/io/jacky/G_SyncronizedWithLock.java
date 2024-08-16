package io.jacky;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter1 implements Runnable {
	private Lock l = new ReentrantLock();
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
		
//		// common pattern
//		while(true) {
//			if(l.tryLock()) {
//				try {
//					this.increment();
//					this.decrement();
//				} finally {
//					l.unlock();
//				}
//			} else {
//				// do something else
//			}
//		}
		
		l.lock();
		try {
			this.increment();
			System.out.println(Thread.currentThread().getName() + " increments " + this.getValue());
			this.decrement();
			System.out.println(Thread.currentThread().getName() + " decrements " + this.getValue());
		} finally {
			l.unlock();
		}
	}
}
public class G_SyncronizedWithLock {
	public static void main(String[] args) {
		
		Counter1 counter1 = new Counter1();
		new Thread(counter1, "Counter1 One").start();
		new Thread(counter1, "Counter1 Two").start();
		new Thread(counter1, "Counter1 Three").start();
		new Thread(counter1, "Counter1 Four").start();
		
		Counter1 counter2 = new Counter1();
		new Thread(counter2, "Counter2 One").start();
		new Thread(counter2, "Counter2 Two").start();
	}
}