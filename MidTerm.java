import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MidTerm {


	public static void main(String[] args) throws IOException {
		System.out.println("Lukes print");
		System.out.println("Krzysztof");
		System.out.println("Mike is in the building");
		Book b = new Book();
		b.setAuthor("Test");

		
		Scanner scnr = new Scanner(System.in);
		int choice;
		boolean userExit = false;
		

		populateSet();
		displayHeader();

	   BookUtilFile.appendToFile(b);

	
	   
	   do {
		choice = displayMenu(scnr); 
		System.out.println();
			switch(choice) {
			case 1:
				displayBookList();
				break;
			case 2:
				searchByAuthor();
				break;
			case 3:
				searchByKeyword();
				break;
			case 4:
				checkOutBook();
				break;
			case 5:
				returnBook();
				break;
			case 0:
				userExit = true;
			}
		} while (!userExit);
		
		
		
	}
	

	private static void displayHeader() {
		System.out.println("Welcome to the Team Beard library terminal!");
		System.out.println("Our books are ir-read-sistible!");
		System.out.println("-------------------------------------------");
	}
	
	private static void populateSet() {}
	
	private static int displayMenu(Scanner scnr) {
		System.out.println("What would you like to do?");
		System.out.println("1. Display the entire list of books");
		System.out.println("2. Search for a book by author");
		System.out.println("3. Search for a book by title or keyword");
		System.out.println("4. Select a book from the list to check out");
		System.out.println("5. Return a book");
		System.out.println("6. Add a book");
		System.out.println("0. Exit the program");
		int menuChoice = getInt(scnr, "Please choose a menu option (1-6, 0 exits): ");
		return menuChoice; 
	}
	
	public static void displayBookList() {
		System.out.println("You have chosen to display all of the books in the current list");

	}
	
	public static void searchByAuthor(){
		System.out.println("You have chosen to search by author");
	}
	
	public static void searchByKeyword(){
		System.out.println("You have chosen to search by title keyword");
	}
	
	public static void checkOutBook(){
		System.out.println("You have chosen to check out a book");
	}
	
	public static void returnBook(){
		System.out.println("You have chosen to return a book");
	}

	// gets int value and checks if valid input
	private static int getInt(Scanner scnr, String prompt) {
		System.out.print(prompt);
		boolean validRange = false;
		do {
			try {
				int num = scnr.nextInt();
				scnr.nextLine();
				if (num > 6 || num < 0) {
					System.out.println("Please enter a valid option.");
					return getInt(scnr, prompt);
				}
				validRange = true;
				return num;
			} catch (InputMismatchException e) {
				System.out.println("Enter a whole number, using digits.");
				scnr.nextLine();
				return getInt(scnr, prompt);
			}
		} while (!validRange);
	}
		
}
