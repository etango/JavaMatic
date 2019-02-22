import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
 * Date: 2/21/2019
 * Handle the types of drink the vending machine has to offer. We can add the drink to our list.
 * If we another drink, *add the ingredients to Recipe and create HashMap of the new drink and ingredient.*
 */
public class Drinks extends Recipe{

	protected ArrayList<String> drink_list = new ArrayList<String>();
	
	
	Drinks(){
		drink_list.add("Coffee");
		drink_list.add("Decaf Coffee");
		drink_list.add("Caffe Latte");
		drink_list.add("Caffe Americano");
		drink_list.add("Caffe Mocha");
		drink_list.add("Cappuccion");
		
		Collections.sort(drink_list);
	}
	public void getDrinks(String drink) {
		
		
	}
	
	public void getCostDrink(String drink) {
		
	}
}
