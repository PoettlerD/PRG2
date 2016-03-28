package sorting.ue.carts;

import java.util.Comparator;

public class CartTotalItemsComparator implements Comparator<Cart> {

	@Override
	public int compare(Cart o1, Cart o2) {
		// TODO Auto-generated method stub
		if (o1.getTotalitems() < o2.getTotalitems())
			return 1;
		if (o1.getTotalitems() > o2.getTotalitems())
			return -1;
		return 0;
	}

}
