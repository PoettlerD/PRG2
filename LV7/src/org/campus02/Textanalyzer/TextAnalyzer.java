package org.campus02.Textanalyzer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class TextAnalyzer implements Runnable {
	
	private static HashMap<Character, Integer> countChars =  new HashMap<>();
	private static int countAllChars = 0;
	private ArrayList<String> text = new ArrayList<>();
	private static Lock LockCountAllChars = new ReentrantLock();
	private static Lock LockCountChars = new ReentrantLock();
	
	
	
	
	public TextAnalyzer(ArrayList<String> text) {
		super();
		this.text = text;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	
	private void IncreaseCountAllChars()
	{
		LockCountAllChars.tryLock();
		try{
			countAllChars++;
		}
		finally
		{
			LockCountAllChars.unlock();
		}
	}
	
	
	private void IncreaseCountChars(Character c)
	{
		LockCountChars.tryLock();
		try{
			if(countChars.containsKey(c))
			{
				countChars.put(c, (countChars.get(c))+1);
			}
			else
				countChars.put(c, 1);
		}
		finally
		{
			LockCountChars.unlock();
		}
	}


	public static HashMap<Character, Integer> getCountChars() {
		return countChars;
	}


	public static int getCountAllChars() {
		return countAllChars;
	}
	
	
	
}
