package toylist.presentation;

import toylist.db.ToyDAO;
import toylist.db.ToyFactory;
import toylist.util.Console;

public class ToyListerApp {
	static ToyDAO toyDAO;

	public static void main(String[] args) {
		Console con = new Console();
		toyDAO = ToyFactory.getToyDAO();
		con.println("Welcome to the Toy Lister app!");
		con.println();
		con.println("Command Menu");
		con.println("list - list all toys");
		con.println("get - get a toy");
		con.println("add - add a toy");
		con.println("exit - exit application");
		String command = con.getString("Enter command:  ");
		
		String displayString = "";
		if (command!=null) {
			if (command.equalsIgnoreCase("list")) {
				displayString = listAllToys();
				con.print(displayString);
			} else if (command.equalsIgnoreCase("get")) {
				
			} else if (command.equalsIgnoreCase("add")) {
				
			} else if (command.equalsIgnoreCase("exit")) {
				
			} else {
				con.println("Invalid command.  Please try again");
			}
		}

	}
	
	private static String listAllToys() {
		String retString = toyDAO.listToys();
		return retString;
	}

	private static String getToy() {
		String retString = "";
		return retString;
	}

	private static String addToy() {
		String retString = "< Method Not Yet Implemented >";
		return retString;
	}

}
