package org.campus02.lotto;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class findTop6Numbers {

	public static int[] fintTop6Numbers(int[][] numbers)
	{
		int [][] counter = new int[45][2];
		
		for (int i = 0; i< 45; i++ )
		{
			
			counter[i][0] = i;
			counter[i][1] = 0;
		}
		
		for (int[] int1 : numbers) {
			for (int i : int1) {
				counter[i-1][1]++;
			}
			
		}
		
	
	Arrays.sort(counter, new Comparator<int[]>() {

		@Override
		public int compare(int[] o1, int[] o2) {
			// TODO Auto-generated method stub
			if (o1[1] < o2[1])
				return 1;
			if (o1[1] > o2[1])
				return -1;
			
			return 0;
		}
		
	});
		
/*	for (int[] is : counter) {
		for (int i : is) {
			System.out.println("Zahl: "+is[0]);
			System.out.println("Counter: "+is[1]);
		}
		
	}*/
	
		int[] retrunarr = new int[6];
		for (int i = 0; i< 6; i++)
			retrunarr[i] = counter[i][0];
		return retrunarr;
	}

	
	
	
	public static HashMap<Integer, Integer> getCounttoNumbers(int[][] numbers)
	{		int [][] counter = new int[45][2];
	
	for (int i = 0; i< 45; i++ )
	{
		
		counter[i][0] = i;
		counter[i][1] = 0;
	}
	
	for (int[] int1 : numbers) {
		for (int i : int1) {
			counter[i-1][1]++;
		}
		
	}
	

Arrays.sort(counter, new Comparator<int[]>() {

	@Override
	public int compare(int[] o1, int[] o2) {
		// TODO Auto-generated method stub
		if (o1[1] < o2[1])
			return 1;
		if (o1[1] > o2[1])
			return -1;
		
		return 0;
	}
	
});
	
/*	for (int[] is : counter) {
	for (int i : is) {
		System.out.println("Zahl: "+is[0]);
		System.out.println("Counter: "+is[1]);
	}
	
}*/


HashMap<Integer, Integer> retrun = new HashMap<>();
for (int[] is : numbers) {
	for (int i : is) {
		if (retrun.containsKey(i))
				{
			retrun.replace(i,(retrun.get(i))+1);
				}
		else
		{
			retrun.put(i, 1);
		}
		
	}
	
}
return retrun;
	}
	
}

