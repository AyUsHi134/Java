public class Book {
	int noOfCopies;

	void nameBooks() {
		System.out.println("Name of the book");

	}

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();

		artOfComputerProgramming.nameBooks();
		effectiveJava.nameBooks();
		cleanCode.nameBooks();

		artOfComputerProgramming.noOfCopies = 500;
		effectiveJava.noOfCopies = 200;
		cleanCode.noOfCopies = 100;

	}

}
