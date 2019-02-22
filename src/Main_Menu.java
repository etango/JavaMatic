import java.util.*;
public class Main_Menu {

	/*
	 * Developer: Elton Tang
	 * Date: 2/21/2019
	 * Objective: Create an automatic coffee dispensing machine. Named JavaMatic
	 * Main_Menu: Will our main class that will run the program when executed.
	 * 
	 * Version: 1.0.0.0
	 * 
	 */
	public static void main(String[] args) {
		
	
		Menu_Creation a = new Menu_Creation();
		a.printCurrentInventory();
		a.getMenu();
		a.MenuSelection();
		
		
		
	}

}
