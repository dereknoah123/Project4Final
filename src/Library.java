import java.util.LinkedList;
import java.util.List;

public class Library {
    private List<Checkout> books;

    public Library() {
        this.books = new LinkedList<>();
    }

    public void addBook(Checkout book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Checkout book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}