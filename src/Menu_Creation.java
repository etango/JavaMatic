import java.util.*;

/*
 *2/20/2019
 *This menu_creation class objective is to create the menu for a coffee dispensing machine.
 *This will handle menu creation. 
 *
 *
 */


public class Menu_Creation extends Drinks {
	/*
	 * Declaring type of datastructure I will using. I will be using array list to store drinks name.
	 * Naming the object later I will refer to down below.
	 *
	 */
	protected ArrayList<String> drink_list = new ArrayList<String>();
	Drinks d1 = new Drinks();
	Recipe r1 = new Recipe();
	
	Menu_Creation(){
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
		for(int i=0;i<d1.drink_list.size();i++) {
			
			System.out.println("\t  " + count + "," + d1.drink_list.get(i)+","+","+getDrinkStatus(d1.drink_list.get(i)));
			count ++;
		}
		
	}
	
	/*
	 * We will be taking user input from scanner then running a if else statement with a try to check for menu option selected.
	 * The try and catch method is to check if the user input a valid integer once converted from a string and check to see if it's within the menu option of drink.
	 */
	public void MenuSelection() {
		Scanner input = new Scanner(System.in);
		String selection = input.nextLine();
	
		if (selection.equalsIgnoreCase("r")) {
			System.out.println("case 1 checked");
			
		}else if(selection.equalsIgnoreCase("q")) {
			System.out.println("case 2 checked");
			
		}else if(selection != null) {
			
			try {
				int number = Integer.parseInt(selection);
				if(number > d1.drink_list.size()) {
					System.out.println("Invalid Selection: " + selection);
				}else
				System.out.println(d1.drink_list.get(number-1));
				
			}catch (NumberFormatException e) {
				System.out.println("Invalid Selection: " + selection);
			}
			
		}	
		
	}
	
	
	
	
}
