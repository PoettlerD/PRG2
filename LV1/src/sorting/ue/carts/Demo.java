package sorting.ue.carts;

import java.util.ArrayList;
import java.util.Collections;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Cart> test = new ArrayList<>();
		test.add(new Cart("poettlerhans", 2, 4, 500));
		test.add(new Cart("trottelkopf", 1, 1, 34));
		test.add(new Cart("karl", 8, 14, 5235));
		
		System.out.println("Vorher:");
		
		for(Cart c : test)
		{
			System.out.println(c.toString());
		}
	/*
	Collections.sort(test);
	System.out.println("Nachher");
	
	
	for(Cart c : test)
	{
		System.out.println(c.toString());
	}
	
	}
*/
		System.out.println("");
		System.out.println("Sorted Uesername");
		Collections.sort(test, new CartUsernameComperator());
		for(Cart c : test)
		{
			System.out.println(c.toString());
		}
	
	System.out.println("");
	System.out.println("Sorted Totalitemscount");
	
	Collections.sort(test, new CartTotalItemsComparator());
	for(Cart c : test)
	{
		System.out.println(c.toString());
	}
	}
	
	
	
	
}
