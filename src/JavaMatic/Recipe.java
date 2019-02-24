package JavaMatic;
import java.util.HashMap;

/*
 * This class will handle our recipe for each drinks
 * 
 *  Date: 2/22/2019
 * updated
 * By Elton
 * Revised setter and getter method.
 * Constructor no longer perform Recipe added to HashMap.
 * Have getRecipe to return the recipe base on the argument it receives. 
 */
public class Recipe {

	/*
	 * By using HashMap, we are able to store the new of ingredient and quantity it will be using to make.
	 * Naming the object the drink name will allow us to access this information easier later.
	 * Also, if we were to add more drink later we can just add another one and the rest of the program will scale with ease and minimal coding.
	 * 
	 */
	protected HashMap<String, Integer> Coffee = new HashMap<String, Integer>();
	protected HashMap<String, Integer> Decaf_Coffee =  new HashMap<String, Integer>();
	protected HashMap<String, Integer> Caffe_Latte = new HashMap<String, Integer>();
	protected HashMap<String, Integer> Caffe_Americano = new HashMap<String, Integer>();
	protected HashMap<String, Integer> Caffe_Mocha = new HashMap<String, Integer>();
	protected HashMap<String, Integer> Cappuccino = new HashMap<String, Integer>();
	
	

	
	Recipe(){
		
	}
	
	/*
	 * @setRecipe
	 * This method is just handling the ingredients and quantity that are needed for the drink and adding them respectively to the list.
	 * By nameing each drink as the object of the Hashmap we are able to add the ingredient and quantity we need to use.
	 * This helps us later because we can determine the cost of the drink, status of the drink, and update our inventory.
	 */
	public void setRecipe() {
		Coffee.put("Coffee", 3);
		Coffee.put("Sugar", 1);
		Coffee.put("Cream", 1);
		Decaf_Coffee.put("Decaf Coffee",3);
		Decaf_Coffee.put("Sugar", 1);
		Decaf_Coffee.put("Cream", 1);
		Caffe_Latte.put("Espresso", 2);
		Caffe_Latte.put("Steamed Milk", 1);
		Caffe_Americano.put("Espresso", 3);
		Caffe_Mocha.put("Espresso", 1);
		Caffe_Mocha.put("Cocoa", 1);
		Caffe_Mocha.put("Steamed Milk", 1);
		Caffe_Mocha.put("Whipped Cream", 1);
		Cappuccino.put("Espresso", 2);
		Cappuccino.put("Steamed Milk", 1);
		Cappuccino.put("Foamed Milk", 1);
	

	}
	
	/*
	 * @getRecipe 
	 * This method is just returning the drink ingredients list whenever called on.
	 * This mainly for checking inventory status and cost.
	 */
	public HashMap<java.lang.String, Integer> getRecipe(String Drink) {
		if (Drink == "Coffee") {
			return Coffee;
		}else if(Drink == "Decaf Coffee") {
			return Decaf_Coffee;
		}else if(Drink == "Caffe Latte") {
			return Caffe_Latte;
		}else if(Drink == "Caffe Americano") {
			return Caffe_Americano;
		}else if(Drink == "Caffe Mocha") {
			return Caffe_Mocha;
		}else if (Drink == "Cappuccino") {
			return Cappuccino;
		}
		return null;
	}
}
