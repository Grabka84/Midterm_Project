import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MidTerm {
	
	public static ArrayList<Book> bookList = new ArrayList<Book>();
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in); // scanner for user input from console
		int choice; // choice from menu to determine what the program will do
		boolean userExit = false; // do while user exit = false
		
		try {
			bookList = BookUtilFile.readFile();
		} catch (IOException e) {
			e.printStackTrace();
		} // from the text file, pull the object data, Book datatype, into a Tree List (Array List)
		
		displayHeader(); // displays an intro header that only appears once
	   
	   do { // while userExit = false
		choice = displayMenu(scnr); // displays the main choice menu method from below, where user enters an integer for choice
		System.out.println();
			switch(choice) {
			case 1:
				displayBookList(); // display the whole array list, all books, all statuses
				break;
			case 2:
				searchByAuthor(); // using a keyword, display all books that contain that author 
								// take from bookList and any object where author == "" put that into a new array then display that
				break;
			case 3:
				searchByKeyword(); // same thing except for titles
				break;
			case 4:
				checkOutBook(); // change the status of a book to checkedOut = true, then assign a due date
				break;
			case 5:
				returnBook(); // change status of a book to checkoOut = false, then clear the due date
				break;
			case 6:
				addBook(); // add a new book to the list
				break;
			case 0:
				userExit = true;
			}
		} while (!userExit);
	   System.out.println(bookList);
//	   saveSet(); // save the newly updated list to the txt file
	   
	   System.out.println("Thank you for using the terminal, goodbye!");
	}
	
	private static void displayHeader() {
		System.out.println("Welcome to the Team Beard library terminal!");
		System.out.println("Our books are ir-read-sistible!");
		System.out.println("-------------------------------------------");
	}
	
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
		System.out.println(bookList);
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

	public static void addBook() {
		System.out.println("You have chosen to add a book to the list");
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
