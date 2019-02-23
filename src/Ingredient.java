import java.util.*;

/*
 * 2/21/2019
 * This class is handling the ingredients for the drinks.
 * 
 * Date: 2/22/2019
 * updated
 * By Elton
 * 
 * Revised constructor to no handle ingredlist add anymore.
 * Task was left to setter method and have the getter method handle the ingredients list.
 * This allows easier implementation for future ingredients. 
 */
public class Ingredient extends Recipe{


	
	protected List<String> ingredlist = new ArrayList<>();

	
	
	Ingredient(){
		
	}
	
	public void setIngredient(){
		ingredlist.add("Coffee");
		ingredlist.add("Decaf Coffee");
		ingredlist.add("Sugar");
		ingredlist.add("Cream");
		ingredlist.add("Steamed Milk");
		ingredlist.add("Foamed Milk");
		ingredlist.add("Espresso");
		ingredlist.add("Cocoa");
		ingredlist.add("Whipped Cream");
	}
	public List<String> getIngredient(){
		
		
		return ingredlist;
	}
	
	
	public String setDrinkIngredient(String x) {
		
		
		
		return null;
	}
	
}
