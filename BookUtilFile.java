import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;


public class BookUtilFile {

	private static Path filePath = Paths.get("Books.txt");

	public static void appendToFile(Book books) throws IOException {
		if (Files.notExists(filePath)) {
			Files.createFile(filePath);
		}

		List<String> bookList = Arrays.asList(books.toString());
		
	
		
		
		
		Files.write(filePath, bookList, StandardOpenOption);

	}
}