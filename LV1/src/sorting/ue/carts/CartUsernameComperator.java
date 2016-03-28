package sorting.ue.carts;

import java.util.Comparator;

public class CartUsernameComperator implements Comparator<Cart> {

	@Override
	public int compare(Cart o1, Cart o2) {

		int user = o1.getUsername().compareTo(o2.getUsername());
		if (user != 0)
		{
			return user;
		}
		return 0;
	}

	

}
