import java.util.ArrayList;

public class Publication {

    private int id;
    private String name;
    private String author;
    private ArrayList<Review> reviews = new ArrayList<>();// reviews can be many so storingit in arraylist

    public Publication(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }

    public String toString() {
        return String.format("id = %d, name = %s, author = %s, Reviews = [%s]", id, name, author, reviews);
    }



    public static void main(String[] args) {
        Publication book = new Publication(123, "The Love Hypothesis","Ayushi");
        book.addReview(new Review(010,"Love Story", 5));
        book.addReview(new Review(101,"Great Book", 5));
        System.out.println(book);

    }
    
}
