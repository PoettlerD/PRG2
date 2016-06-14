package org.campus02.counter;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterLock implements Runnable {
	public static int counter;
	private static Lock lock = new ReentrantLock();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1_000_000; i++) {
			lock.lock();
			try {Increase();
			}
			finally {
				lock.unlock();
			}
		}
	}

	private void Increase() {
	
		
			counter++;
		 
	}
}
