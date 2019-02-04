import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class BookUtilFile {

	private static Path filePath = Paths.get("Books.txt");
	
	
	public static void appendToFile(Book books) throws IOException {
		if (Files.notExists(filePath)) {
			Files.createFile(filePath);
		}
		
		ArrayList<Book> bookList = new ArrayList<Book>(); // array list that will hold the list of books
				
//		Files.write(filePath, stringTo.bookList, StandardOpenOption.TRUNCATE_EXISTING);

	}
	
}
