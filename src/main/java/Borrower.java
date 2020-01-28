import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> bookCollection;

    public Borrower(String name) {
        this.name = name;
        this.bookCollection = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int countBooks() {
        return this.bookCollection.size();
    }

    public void borrowBook(Library library) {
        Book book = library.removeBook();
        this.bookCollection.add(book);
    }
}
