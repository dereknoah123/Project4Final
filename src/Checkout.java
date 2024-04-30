public class Checkout extends Book {
    private String LibrariansName;
    private String LibrarianID;

    public Checkout(String LibrariansName, String LibrarianID, String title, String author, String isbn) {
        super(title, author, isbn);
        this.LibrariansName = LibrariansName;
        this.LibrarianID = LibrarianID;
    }

    public String getLibrariansName() {
        return LibrariansName;
    }

    public String getLibrarianID() {
        return LibrarianID;
    }
}