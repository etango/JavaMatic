import java.util.*;

/*
 * 2/21/2019
 * This class is handling the ingredients for the drinks.
 */
public class Ingredient extends Cost_of_Ingredient {


	
	protected List<String> ingredlist = new ArrayList<>();
	
	
	Ingredient(){
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
	
	public String getIngredient(int x){
		
		
		return ingredlist.get(x);
	}
	
	
	public String setDrinkIngredient(String x) {
		
		
		
		return null;
	}
	
}
