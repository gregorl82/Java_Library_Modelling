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

        // Initialise a new HashMap for the number of books of each genre
        HashMap<String, Integer> genreHash = new HashMap<>();

        // Loop through each of the books in the library's stock
        for (Book book : this.stock) {
            String bookGenre = book.getGenre();

            // if the book's genre is already in the HashMap, increase the associated value by 1
            if (genreHash.containsKey(bookGenre)){
                int newValue = genreHash.get(bookGenre) + 1;
                genreHash.put(bookGenre, newValue);

            // otherwise, create a new key with an initial value of 1
            } else {
                genreHash.put(bookGenre, 1);
            }
        }

        // return the value associated with the passed in genre
        return genreHash.get(genre);
    }
}
