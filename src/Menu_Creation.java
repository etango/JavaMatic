import java.text.DecimalFormat;
import java.util.*;

/*
 *2/20/2019
 *This menu_creation class objective is to create the menu for a coffee dispensing machine.
 *This will handle menu creation. 
 *
 *Date: 2/22/2019
 *updated
 *By Elton
 *The constructor in Menu_Creation will handle all the execution. Removed all object calling from different classes. Extends from appropriately class to call method properly. 
 *Was having issue with Hashmap holding proper value because calling different new object from different classes that reset that Hashmap list.
 *Cleaned up and run smoother
 *Revised Try and catch method to confirm if user selected a number correlating with menu item and check if it's within bound of the menu options.
 *Added for application to continue running properly by displaying menu and show updated inventory after user selected an option.
 */


public class Menu_Creation extends Drinks {
	/*
	 * Declaring type of data structure I will using. I will be using array list to store drinks name.
	 * Naming the object later I will refer to down below.
	 *
	 */
	protected ArrayList<String> drink_list = new ArrayList<String>();
	boolean run = true;
	Scanner input = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00");

	
	Menu_Creation(){
		
		setIngredient();
		setRecipe();
		initalStockInventory(getIngredient());
		setDrinks();
		printCurrentInventory();
		getMenu();
		MenuSelection();
		
	}
	
	public void setMenu() {
	}
	
	
	/*
	 * Creating the drink menu by running a for loop and setting count 1.
	 * Purpose of count will be to list the drink correlating with the number for menu selection later.
	 * Using our methods from drink_list that we created we will get the drinks name base on the iteration of i.
	 * We will also be putting the cost and the status of drink here.
	 */
	public void getMenu() {
		int count =1;
		System.out.println("Menu:");
		//System.out.println("Drink list size " + drinkListSize()  );
		for(int i=0;i<drinkListSize();i++) {
			System.out.println(count + "," + getDrink(i)+",$"+df.format(getCostDrink(getDrink(i)))+","+getDrinkStatus(getDrink(i)));
			count ++;
		}
		
	}
	
	/*
	 * We will be taking user input from scanner then running a if else statement with a try to check for menu option selected.
	 * The try and catch method is to check if the user input a valid integer once converted from a string and check to see if it's within the menu option of drink.
	 * 1st update: 2/21/2019
	 * added while loop to continue to run the program as long run = true. When user select q or Q then run will be false.
	 * The while loop will continue to run for user selection and print inventory and menu.
	 */
	public void MenuSelection() {
		while(run) {
			
			String selection = input.next();
			if (selection.equalsIgnoreCase("r")) {
				this.restockInventory();
			}else if(selection.equalsIgnoreCase("q")) {
				run = false;
				break;
			
			}else if(selection.isEmpty()) {
				run = true;
			}else if(selection != "") {
				boolean num = false;
				try {
					@SuppressWarnings("unused")
					int number = Integer.parseInt(selection);
					num = true;
					
					}catch (NumberFormatException e) {
						num = false;
						System.out.println("Invalid Selection: " + selection);
					}
					
					if(num) {
						if(Integer.parseInt(selection)  > 0 && Integer.parseInt(selection) <= drinkListSize()) {
					
							if(getDrinkStatus(getDrink(Integer.parseInt(selection)-1))) {
								getDrinks(getDrink(Integer.parseInt(selection)-1));
								System.out.println("Dispensing:" + getDrink(Integer.parseInt(selection)-1));
							}else
								System.out.println("Out of Stock");
					
						}else
							System.out.println("Invalid Selection:" + selection);
					
					}

						
				
			}

			printCurrentInventory();
			getMenu();
		}
	}
}
	