import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/*
 * Date: 2/21/2019
 * This class is handling inventory.
 * It will initialize the inventory when the program is first executed then manage the inventories from then.
 * Checking if we have enough ingredient to make the drink and keep tracking of inventories count.
 * Still in draft phase
 */

public class Inventory extends Ingredient {

	
	private SortedMap<String, Integer> ingre = new TreeMap<String, Integer>();
		
	Inventory(){
		this.initalStockInventory();
	}
	
	/*
	 * This is run when the program is first launched and fully stock the inventory.
	 */
	public void initalStockInventory() {
	
		
		for (int i=0;i<this.ingredlist.size();i++) {
			ingre.put(this.ingredlist.get(i), 10);
		}
	}
	
	public void restockInventory() {
		
		
		for(int i=0;i<ingre.size();i++) {
			ingre.put(this.ingredlist.get(i), 10);
			}
		}
	
	/*
	 * This is checking for inventory status by taking an argument of the ingredient type and the amount being used.
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
	
	public void updateInventory() {
		
	}
	
	/*
	 * This will print out the current inventory when called upon.
	 */
	public void printCurrentInventory() {
		
		System.out.println("Inventory:");
		for (Map.Entry<String, Integer> entry : ingre.entrySet()) {
			System.out.println("\t  "+entry.getKey() + "," + entry.getValue());
		}
	
				
	}
}
