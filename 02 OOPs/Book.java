public class Book {
	private int noOfCopies;

	Book(int noOfCopies){ // constructor 
		this.noOfCopies = noOfCopies;
	}
	
	
	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies)
	{
		if(noOfCopies > 0)
		this.noOfCopies = noOfCopies;

	}
 
	public void increaseNoOfCopies(int howMuch){
        setNoOfCopies(this.noOfCopies + howMuch);
	}

	public void decreaseNoOfCopies(int howMuch){
		setNoOfCopies(this.noOfCopies - howMuch);
     

	}


	void nameBooks() {
		System.out.println("Name of the book");

	}

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book(100);
		Book effectiveJava = new Book(50);
		Book cleanCode = new Book(40);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());

		artOfComputerProgramming.nameBooks();
		effectiveJava.nameBooks();
		cleanCode.nameBooks();

		artOfComputerProgramming.setNoOfCopies(500);

		artOfComputerProgramming.increaseNoOfCopies(200);

		artOfComputerProgramming.decreaseNoOfCopies(50);

		effectiveJava.setNoOfCopies(200);
		
		effectiveJava.increaseNoOfCopies(200);
		effectiveJava.decreaseNoOfCopies(50);
        
		
		cleanCode.setNoOfCopies(100);

		cleanCode.increaseNoOfCopies(200);
		cleanCode.decreaseNoOfCopies(50);

	}

	
}
