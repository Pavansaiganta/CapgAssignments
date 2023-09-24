package gokhana1;

import java.util.Comparator;

public class SortFoodBasedOnPricetLowToHigh implements Comparator<Food>{

	@Override
	public int compare(Food o1, Food o2) {
		// TODO Auto-generated method stub
		return o1.getPrice()-o2.getPrice();
	}

}
