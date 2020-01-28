import java.util.ArrayList;

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
}
