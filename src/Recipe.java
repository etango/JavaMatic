import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * This class will handle our recipe for each drinks 
 *
 */
public class Recipe extends Inventory{

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
	Inventory inv = new Inventory();

	
	Recipe(){
		
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
	 * This method will check if the drink avaliable to be sold or not. Takes an argument of drink and check the drink ingredients that currently in stock.
	 * If they are in stock they value true will returned if falsed. The value will be false.
	 */
	public boolean getDrinkStatus(String Drink) {
		
		boolean status = true;
		if(Drink == "Coffee") {
			
			for(Map.Entry<String, Integer> entry : Coffee.entrySet()) {
				status = inv.checkInventory(entry.getKey(),entry.getValue());
				if(status == false) {
					System.out.print("Out of stock:" + Drink);
				}
			}	
		}
		if(Drink == "Decaf Coffee") {
			for(Map.Entry<String, Integer> entry : Decaf_Coffee.entrySet()) {
				status = inv.checkInventory(entry.getKey(),entry.getValue());
				if(status == false) {
					System.out.print("Out of stock:" + Drink);
				}
			}
		}
		if(Drink == "Caffe Latte") {
			for(Map.Entry<String, Integer> entry : Caffe_Latte.entrySet()) {
				status = inv.checkInventory(entry.getKey(),entry.getValue());
				if(status == false) {
					System.out.print("Out of stock:" + Drink);
				}
			}
		}
		if(Drink == "Caffe Americano") {
			for(Map.Entry<String, Integer> entry : Caffe_Americano.entrySet()) {
				status = inv.checkInventory(entry.getKey(),entry.getValue());
				if(status == false) {
					System.out.print("Out of stock:" + Drink);
				}
			}
		}
		if(Drink == "Caffe Mocha") {
			for(Map.Entry<String, Integer> entry : Caffe_Mocha.entrySet()) {
				status = inv.checkInventory(entry.getKey(),entry.getValue());
				if(status == false) {
					System.out.print("Out of stock:" + Drink);
				}
			}	
		}
		if(Drink == "Cappuccino") {
			for(Map.Entry<String, Integer> entry : Cappuccino.entrySet()) {
				status = inv.checkInventory(entry.getKey(),entry.getValue());
				if(status == false) {
					System.out.print("Out of stock:" + Drink);
				}
		}
		
		
		}
		return status;
	}
	
}
