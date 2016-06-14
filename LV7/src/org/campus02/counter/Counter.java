package org.campus02.counter;

import org.omg.CORBA.DynAnyPackage.Invalid;

public class Counter implements Runnable {
	
	public static int counter;
	private static Object lock = new Object();


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i =0; i< 1_000_000; i++)
		{
			Increase();
		}
	}

	
	private synchronized void Increase()
	{
		synchronized (lock) {
			counter++;
		}
	
	}
}
