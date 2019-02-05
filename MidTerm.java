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
				searchByAuthor(scnr); // using a keyword, display all books that contain that author 
								// take from bookList and any object where author == "" put that into a new array then display that
				break;
			case 3:
				searchByKeyword(scnr); // same thing except for titles
				break;
			case 4:
				checkOutBook(scnr); // change the status of a book to checkedOut = true, then assign a due date
				break;
			case 5:
				returnBook(scnr); // change status of a book to checkoOut = false, then clear the due date
				break;
			case 6:
				addBook(scnr); // add a new book to the list
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
	
	public static void searchByAuthor(Scanner scnr){
		System.out.println("You have chosen to search by author");
		System.out.print("Which author do you choose? ");
		String authChoice = scnr.nextLine();
		ArrayList<Book> authString = new ArrayList<>(); 
		
		for(Book book : bookList) {
			if(book.getAuthor().contains(authChoice)) {
				authString.add(book);
				System.out.println("Books by " + book.getAuthor() + " are: ");
				for(Book auth : authString) {
					System.out.println(auth.getTitle());
				}
			}
		}
		System.out.println("");
	}
	
	public static void searchByKeyword(Scanner scnr){
		System.out.println("You have chosen to search by title keyword");
		System.out.print("Please enter keyword: ");
		String keyChoice = scnr.nextLine();
		ArrayList<Book> keyString = new ArrayList<>();
		
		for(Book book : bookList) {
			if(book.getTitle().contains(keyChoice)) {
				keyString.add(book);
				System.out.println("Keyword matches " + book.getTitle());
				for(Book key : keyString) {
					System.out.println(key.getTitle());
				}
			}
		}
		System.out.println("");
	}
	
	public static void checkOutBook(Scanner scnr){
		System.out.println("You have chosen to check out a book");
		System.out.println("Which book would you like. ");
		String bookChoice = scnr.nextLine();
		ArrayList<Book> outChoice = new ArrayList<>();
		
		for(Book book : bookList) {
			if(book.getTitle().equals(outChoice)) {
				outChoice.remove(book);
				System.out.println("The book you're checking out is: " + book.getTitle());
				for(Book check : outChoice) {
					System.out.println(check.getTitle());
				}
			}
		}
		System.out.println("");
	}
	
	public static void returnBook(Scanner scnr){ //dont do add book yet(Luke)
		System.out.println("You have chosen to return a book");
		System.out.println("Which book would you like to return? ");
		String bookReturn = scnr.nextLine();
		ArrayList<Book> returnChoice = new ArrayList<>();
		
		for(Book book : bookList) { 
			if(book.getTitle().equals(returnChoice)) {
				returnChoice.add(book);
				System.out.println("The book you're returning is: " + book.getTitle()); 
				for(Book reCheck : returnChoice) {
					System.out.println(reCheck.getTitle());
				}
			}
		}
		System.out.println("");
	}

	public static void addBook(Scanner scnr) {
		System.out.println("You have chosen to add a book to the list");
		System.out.println("Which book would you like to add");
		String bookAdd = scnr.nextLine();
		ArrayList<Book> addChoice = new ArrayList<>();
		
		for(Book book : bookList) {
			if(book.equals(addChoice)) {
				addChoice.add(book);
				System.out.println("The book you're adding is " + book.getTitle());
				for(Book addB : addChoice) {
					System.out.println(addB.getTitle());
				}
			}
		}
		System.out.println("");
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
