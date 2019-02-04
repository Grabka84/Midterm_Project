import java.io.IOException;

public class MidTerm {

	public static void main(String[] args) throws IOException {
		System.out.println("Lukes print");
		System.out.println("Krzysztof");
		System.out.println("Mike is in the building");
		Book b = new Book();
		b.setAuthor("Test");

		BookUtilFile.appendToFile(b);

	}

}
