package gokhana1;

import java.util.Objects;

public class Food implements Comparable<Food> {

	 private String itemName;
	 private  int price;
	 private String category;
	/**
	 * 
	 */
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param itemName
	 * @param price
	 * @param category
	 */
	public Food(String itemName, int price, String category) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.category = category;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Food [itemName=" + itemName + ", price=" + price + ", category=" + category + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(category, itemName, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		return Objects.equals(category, other.category) && Objects.equals(itemName, other.itemName)
				&& price == other.price;
	}
	@Override
	public int compareTo(Food food) {
		
		return this.getItemName().compareTo(food.getItemName());
	}
	
	
	
	
	
}
