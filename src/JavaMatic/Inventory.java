import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
 * Date: 2/21/2019
 * This class is handling inventory.
 * It will initialize the inventory when the program is first executed then manage the inventories from then.
 * Checking if we have enough ingredient to make the drink and keep tracking of inventories count.
 * Still in draft phase
 * 
 * Date: 2/22/2019
 * updated
 * By Elton
 * Revised Inventory and no long have constructor initializing the initalstockinventory.
 * Ran into an issue where inventory wasn't being updated correctly. It would update but reset to is initial inventory later when calling it again for status check.
 * This was mainly issue when calling it in a different class and presented it with a different object. This was developer error but fixes was applied and the application has been updated
 * and tested to run properly and consistently.
 * updated initailStockInventory to take a List as an argument for future scaling of the ingredient to be easier.
 */

public class Inventory extends Ingredient {
	protected Map<String, Integer> ingre = new TreeMap<String, Integer>();
	
	

	Inventory(){
	}
	
	/*
	 * @initialStockInventory
	 * This is run when the program is first launched and fully stock the inventory.
	 */
	public void initalStockInventory(List <String> ingredlist) {
		
		for (int i=0;i<ingredlist.size();i++) {
			ingre.put(ingredlist.get(i), 10);
			
		}
	}
	/*
	 * @restockInventory
	 * When menu option r or R is selected this method will be called and restock all the ingredient to 10.
	 */
	public void restockInventory() {
		for(int i=0;i<ingre.size();i++) {
			ingre.put(ingredlist.get(i), 10);
			}

	}
	
	/*
	 * @updateInventory
	 * This is checking for inventory status by taking an argument of the ingredient type and the amount being used.
	 */
	
	public void updateInventory(String ingredient, int quantity) {
		
		int stock = ingre.get(ingredient)-quantity;
		ingre.put(ingredient, stock);
	}
	
	/*
	 * @printCurrentInventory
	 * This will print out the current inventory when called upon.
	 */
	public void printCurrentInventory() {
		
		System.out.println("Inventory:");
		for (Map.Entry<String, Integer> entry : ingre.entrySet()) {
			System.out.println(entry.getKey() + "," + entry.getValue());
		}
	
				
	}
	
	/*
	 * checkInventory
	 * This will handling checking inventory if the current inventory has enough ingredients to make the drink by checking the name of ingredient and quantity from the argument and comparing it to the list. 
	 */
public boolean checkInventory(String ingredient, int amount) {
		
		boolean check = true;
		if(ingre.get(ingredient) >= amount) {
			check = true;
		}else if(ingre.get(ingredient) < amount) {
			check = false;
		}
		
		return check;
	}
}
