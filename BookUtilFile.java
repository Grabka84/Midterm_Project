import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;
import java.util.TreeMap;


public class BookUtilFile {

	
	private static Path filePath = Paths.get("Books.txt");
	
	
	public static void appendToFile(Book books) throws IOException{
		if (Files.notExists(filePath)) {
			Files.createFile(filePath);
		}

		TreeMap<String, Book> tmap = new TreeMap<String, Book>();
		tmap.put("Moby Dick", new Book());
		tmap.put("Old Yeller", new Book());
		tmap.put("This Side Of The Mountain", new Book());
		tmap.put("Where The Red Ferm Grows", new Book());
		tmap.put("To Kill A Mocking Bird", new Book());
		tmap.put("The Giver", new Book());
		tmap.put("Sahara", new Book());
		tmap.put("Alice In WonderLand", new Book());
		tmap.put("Inca Gold", new Book());
		tmap.put("Catch Me If You Can", new Book());
		tmap.put("Can't Hurt Me", new Book());
		tmap.put("Green Eggs & Ham", new Book());
		
//	List <String> booksToAdd = Arrays.asList(books.toString());
//	Files.write(filePath, booksToAdd, StandardOpenOption.APPEND);
	
	}
	
	
	
	
	
	
	
	
	
	
}
