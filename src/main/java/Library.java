import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private int capacity;
    private ArrayList<Book> stock;

    public Library(int capacity) {
        this.capacity = capacity;
        this.stock = new ArrayList<>();
    }

    public int countBooks() {
        return this.stock.size();
    }

    public void addBook(Book book) {
        if (checkCapacity()){
            this.stock.add(book);
        }
    }

    public boolean checkCapacity(){
        return countBooks() < this.capacity;
    }

    public Book removeBook() {
        return this.stock.remove(0);
    }

    public int numberOfBooksByGenre(String genre) {
        HashMap<String, Integer> genreHash = new HashMap<>();
        for (Book book : this.stock) {
            String bookGenre = book.getGenre();
            if (genreHash.containsKey(bookGenre)){
                int newValue = genreHash.get(bookGenre) + 1;
                genreHash.put(bookGenre, newValue);
            } else {
                genreHash.put(bookGenre, 1);
            }
        }
        return genreHash.get(genre);
    }
}
