import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class BookUtilFile {

	private static Path filePath = Paths.get("Books.txt");

	public static void appendToFile(Book books) throws IOException {
		if (Files.notExists(filePath)) {
			Files.createFile(filePath);
		}

		List<String> bookList = Arrays.asList(books.toString());
	//Book(Integer refNum, String title, String author, boolean checkedIn, Date dueDate)
		list.add(200,"Outliers", "Malcolm Gladwell",checkedIn, dueDate);
		
		
		Files.write(filePath, bookList, StandardOpenOption.APPEND);

	}
}