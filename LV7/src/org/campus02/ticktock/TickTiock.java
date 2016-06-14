package org.campus02.ticktock;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Scanner;

public class TickTiock implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while (!Thread.currentThread().isInterrupted()) {

				Date d = new Date();
				System.out.println(d.toString());
				try {
					Thread.sleep(1000L);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					Thread.currentThread().interrupt();
					
				}
			}

			
			
		}
			
	
	}


