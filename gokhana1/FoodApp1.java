package gokhana1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;



public class FoodApp1 {


	public static void main(String[] args) {
		TreeSet<Food> allFoods = new TreeSet<>();

		Food f1 = new Food("Fish Biryani",150,"Nonveg");
		Food f2 = new Food("Tiffin",50,"Veg");
		Food f3 = new Food("Rice",70,"Veg");
		Food f4 = new Food("Chicken Biryani",250,"Nonveg");
	
		allFoods.add(f1);
		allFoods.add(f2);
		allFoods.add(f3);
		allFoods.add(f4);
	
	
	for (Food food : allFoods) {
		System.out.println(food);
	}
	System.out.println("------------Foods(Low to High)---------");
	getFoodBasedOnPriceLowToHigh(allFoods);

	System.out.println("------------Foods(High to Low)---------");
	getFoodBasedOnPriceHighToLow(allFoods);
	
	
	
	
	
	}

	private static void getFoodBasedOnPriceHighToLow(TreeSet<Food> allFoods) {
		
		List<Food> tempList = new ArrayList<>();
     	tempList.addAll(allFoods);
		
     	SortFoodBasedOnPriceHighToLow sortCode = new SortFoodBasedOnPriceHighToLow();
     	Collections.sort(tempList, sortCode);
	
    	for (Food food : tempList) {
			System.out.println(food);
		}
	}

	private static void getFoodBasedOnPriceLowToHigh(TreeSet<Food> allFoods) {
		// TODO Auto-generated method stub
		List<Food> tempList = new ArrayList<>();
     	tempList.addAll(allFoods);
		
     	SortFoodBasedOnPricetLowToHigh sortCode = new SortFoodBasedOnPricetLowToHigh();
     	Collections.sort(tempList, sortCode);
	
    	for (Food food : tempList) {
			System.out.println(food);
	}

	
	}	
		
	

	
}
