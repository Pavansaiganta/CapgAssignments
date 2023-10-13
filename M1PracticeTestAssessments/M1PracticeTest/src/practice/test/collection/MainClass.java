package practice.test.collection;

import practice.test1.Type;

public class MainClass {
	public static void main(String[] args) {
		
	
BusinessCollectionOperation task = new BusinessCollectionOperation();
		
		System.out.println(" Print Food Based on Price High To Low");
		System.out.println(task.getFoodByPriceHighToLow(Type.NON_VEG));
		System.out.println("----------------------");
		
		System.out.println(" Print Food Based on Region");
		System.out.println(task.getFoodByAvgReview("Asian"));
		System.out.println("----------------------");
		
		System.out.println(" Print Food Based on Type & Region");
        System.out.println(task.groupFoodBasedOnTypeAndRegion(Type.NON_VEG));
		

		
	}

}
