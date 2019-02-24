package JavaMatic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/*
 * Date: 2/21/2019
 * Handle the types of drink the vending machine has to offer. We can add the drink to our list.
 * If we another drink, *add the ingredients to Recipe and create HashMap of the new drink and ingredient.*
 * Date: 2/22/2019
 * updated
 * By Elton
 * Instead of having the constructor perform drink list added. I moved it to setDrink aka setter. then we will call the size by using drink list size to determine the size and getDrink to return drink at whichever iteration.
 * I moved the check status of drink to this class since I didn't make sense to have it in inventory. Consistency is the focus here.
 */
public class Drinks extends Inventory{

	protected ArrayList<String> drink_list = new ArrayList<String>();
	private double cost =0.00;
	
	Cost_of_Ingredient c1 = new Cost_of_Ingredient();
	
	
	Drinks(){
	}
	
	/*
	 * @setDrinks
	 * this will add the list of drink into the array list then we have collections framework sort feature to sort the drinks in order.
	 */
	public void setDrinks() {
		drink_list.add("Coffee");
		drink_list.add("Decaf Coffee");
		drink_list.add("Caffe Latte");
		drink_list.add("Caffe Americano");
		drink_list.add("Caffe Mocha");
		drink_list.add("Cappuccino");
		Collections.sort(drink_list);
	}
	
	/*
	 * @drinkListSize 
	 * This method just return the size of the drink. The purpose of this when we use the for loop we don't have to update it when we modify the drink list.
	 * 
	 */
	public int drinkListSize() {
		return drink_list.size();
	}
	
	/*
	 * @getDrink
	 * Method just return the drink depends on the iteration.
	 */
	public String getDrink(int i) {
		return drink_list.get(i);
	}
	
	/*
	 * @getDrinkStatus
	 * This method will check if the drink avaliable to be sold or not. Takes an argument of drink and check the drink ingredients that currently in stock.
	 * If they are in stock they value true will returned if falsed. The value will be false.
	 */

	public boolean getDrinkStatus(String Drink) {
		
		boolean status = true;
		if(Drink == "Coffee") {
			
			for(Map.Entry<String, Integer> entry : Coffee.entrySet()) {
				status = checkInventory(entry.getKey(),entry.getValue());
				if(status == false) {
					break;
				}
			}	
		}
		if(Drink == "Decaf Coffee") {
			for(Map.Entry<String, Integer> entry : Decaf_Coffee.entrySet()) {
				status = checkInventory(entry.getKey(),entry.getValue());
				if(status == false) {
					break;
				}
			}
		}
		if(Drink == "Caffe Latte") {
			for(Map.Entry<String, Integer> entry : Caffe_Latte.entrySet()) {
				status = checkInventory(entry.getKey(),entry.getValue());
				if(status == false) {
					break;
				}
			}
		}
		if(Drink == "Caffe Americano") {
			for(Map.Entry<String, Integer> entry : Caffe_Americano.entrySet()) {
				status = checkInventory(entry.getKey(),entry.getValue());
				if(status == false) {
					break;
				}
			}
		}
		if(Drink == "Caffe Mocha") {
			for(Map.Entry<String, Integer> entry : Caffe_Mocha.entrySet()) {
				status = checkInventory(entry.getKey(),entry.getValue());
				if(status == false) {
					break;
				}
			}	
		}
		if(Drink == "Cappuccino") {
			for(Map.Entry<String, Integer> entry : Cappuccino.entrySet()) {
				status = checkInventory(entry.getKey(),entry.getValue());
				if(status == false) {
					break;
				}
		}
		
		
		}
		return status;
	}
	
	/*
	 * @getDrinks
	 * This method is designed to handle the selection of the drink and take the ingredients and quantity it takes to make the drink and deducted from the inventory.
	 * By calling the update method and entering the type of ingredients and the quantity of it.
	 */
	public void getDrinks(String Drink) {
		if(Drink == "Coffee") {
			
			for(Map.Entry<String, Integer> entry : Coffee.entrySet()) {
				updateInventory(entry.getKey(), entry.getValue());
			}	
		}
		if(Drink == "Decaf Coffee") {
			for(Map.Entry<String, Integer> entry : Decaf_Coffee.entrySet()) {
				updateInventory(entry.getKey(), entry.getValue());
			}
		}
		if(Drink == "Caffe Latte") {
			for(Map.Entry<String, Integer> entry : Caffe_Latte.entrySet()) {
				updateInventory(entry.getKey(), entry.getValue());
			}
		}
		if(Drink == "Caffe Americano") {
			for(Map.Entry<String, Integer> entry : Caffe_Americano.entrySet()) {
				updateInventory(entry.getKey(), entry.getValue());
			}
		}
		if(Drink == "Caffe Mocha") {
			for(Map.Entry<String, Integer> entry : Caffe_Mocha.entrySet()) {
				updateInventory(entry.getKey(), entry.getValue());
			}	
		}
		if(Drink == "Cappuccino") {
			for(Map.Entry<String, Integer> entry : Cappuccino.entrySet()) {
				updateInventory(entry.getKey(), entry.getValue());
			}
		}
		
	}
	
	/*
	 * @getCostDrink
	 * 
	 * Added an if else statement to take to check the argument for which drink was selected.
	 * After the drink is determined, we get the cost of the drink by using the method getCost(name of the ingredient, the amount of it)
	 * and get the returned sum of and add it to cost. We cycle through all the ingredients and return the sum of those ingredient and add it to the cost.
	 * We have cost set at 0.00 at the top so the cost will be reset to zero after it's done returning the cost.
	 */
	public double getCostDrink(String Drink) {

		cost = 0.00;
		
		if(Drink == "Coffee") {
			
			for(Map.Entry<String, Integer> entry : Coffee.entrySet()) {
				cost += c1.getCost(entry.getKey(), entry.getValue());
			}	
		}
		if(Drink == "Decaf Coffee") {
			for(Map.Entry<String, Integer> entry : Decaf_Coffee.entrySet()) {
				cost += c1.getCost(entry.getKey(), entry.getValue());
			}
		}
		if(Drink == "Caffe Latte") {
			for(Map.Entry<String, Integer> entry : Caffe_Latte.entrySet()) {
				cost += c1.getCost(entry.getKey(), entry.getValue());
			}
		}
		if(Drink == "Caffe Americano") {
			for(Map.Entry<String, Integer> entry : Caffe_Americano.entrySet()) {
				cost += c1.getCost(entry.getKey(), entry.getValue());
			}
		}
		if(Drink == "Caffe Mocha") {
			for(Map.Entry<String, Integer> entry : Caffe_Mocha.entrySet()) {
				cost += c1.getCost(entry.getKey(), entry.getValue());
			}	
		}
		if(Drink == "Cappuccino") {
			for(Map.Entry<String, Integer> entry : Cappuccino.entrySet()) {
				cost += c1.getCost(entry.getKey(), entry.getValue());
			}
		}
		return cost;
	}
	
}
