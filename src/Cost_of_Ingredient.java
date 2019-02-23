import java.util.HashMap;

/*
 * Date: 2/21/2019
 * This will handle the cost of ingredient.
 * Still a work in progress.
 * Date: 2/22/2019
 * updated
 * By Elton
 * No changes here.
 */

public class Cost_of_Ingredient extends Inventory {

	
	protected HashMap<String,Double> cost = new HashMap<String,Double>();
	private double sum =0.00;

	
	
	public Cost_of_Ingredient() {

		setCost();
		
		
	}

	private void setCost() {

		cost.put("Coffee", 0.75);
		cost.put("Decaf Coffee", 0.75);
		cost.put("Sugar", 0.25);
		cost.put("Cream", 0.25);
		cost.put("Steamed Milk", 0.35);
		cost.put("Foamed Milk", 0.35);
		cost.put("Espresso", 1.10);
		cost.put("Cocoa", 0.90);
		cost.put("Whipped Cream", 1.00);
		
		
	}
	public Double getCost(String Ingredient, int amount) {
		sum = 0.00;
		sum = cost.get(Ingredient) * amount;
		return sum;
	}
	

	
}
