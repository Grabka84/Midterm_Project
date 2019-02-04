import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;


public class BookUtilFile {
	
	private static Path filePath = Paths.get("Books.txt");


	public static ArrayList<Book> bookList = new ArrayList<Book>();
	
	public static ArrayList<Book> readFile() throws IOException {
		List<String> lines = Files.readAllLines(filePath);
				
		for (String line: lines) {
			String[] parts = line.split(",");
			try {
				bookList.add(new Book(Integer.parseInt(parts[0]), parts[1], parts[2], Boolean.parseBoolean(parts[3]), parts[4]));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return bookList;
	}
	
	public static void SaveFile(Book books) throws IOException {
		if (Files.notExists(filePath)) {
			Files.createFile(filePath);
		}
		
		ArrayList<String> stringBookList = new ArrayList<String>(); // string array list to hold info that will be saved to txt file
		
		for (Book book : bookList) { 
			String ref = String.valueOf(book.getRefNum());
			String tit = book.getTitle();
			String auth = book.getAuthor();
			String chkin = String.valueOf(book.getCheckedIn());
			String due = String.valueOf(book.getDueDate());
			stringBookList.add(ref+","+tit+","+auth+","+chkin+","+due);
		}
		
		Files.write(filePath, stringBookList, StandardOpenOption.TRUNCATE_EXISTING);
	}

}
