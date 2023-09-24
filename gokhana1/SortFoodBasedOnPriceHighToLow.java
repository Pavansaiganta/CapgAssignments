package gokhana1;

import java.util.Comparator;

public class SortFoodBasedOnPriceHighToLow  implements Comparator<Food>{

	@Override
	public int compare(Food o1, Food o2) {
		// TODO Auto-generated method stub
		return o2.getPrice()-o1.getPrice();
	}

}
