import java.util.HashMap;

/*
 * Date: 2/21/2019
 * This will handle the cost of ingredient.
 * Still a work in progress.
 */

public class Cost_of_Ingredient {

	
	protected HashMap<String,Double> cost = new HashMap<String,Double>();
	
	public Cost_of_Ingredient() {
		
		this.setCost();
		
		
	}

	private void setCost() {
		cost.put("Coffee", 0.75);
		cost.put("Decaf Coffee", 0.75);
		cost.put("Sugar", 0.25);
		cost.put("Cream", 0.25);
		cost.put("Cocoa", 0.90);
		cost.put("Foamed Milk", 0.35);
		cost.put("Espresso", 1.10);
		cost.put("Cocoa", 0.90);
		cost.put("Whipped Cream", 1.00);
		
		
	}
	public Double getCost(String Ingredident) {
		
		return this.cost.get(Ingredident);
	}
	

	
}
