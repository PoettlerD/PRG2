package org.campus02.ticktock;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TickTiock tt = new TickTiock();
		Thread a = new Thread(tt);
		a.start();
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		a.interrupt();
		System.out.println("Finished");
		
		
		
	}

}
