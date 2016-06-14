package org.campus02.counter;

public class ConterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		
		t1.start();
		t2.start();
		
			
		/*	try {
				t1.join();
				t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		
		System.out.println(Counter.counter);

	}

}
