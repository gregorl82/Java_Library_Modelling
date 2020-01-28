import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book;

    @Before
    public void before(){
        borrower = new Borrower("George");
        library = new Library(12);
        book = new Book("Pride and Prejudice", "Jane Austen", "Classics");
    }

    @Test
    public void hasAName(){
        assertEquals("George", borrower.getName());
    }

    @Test
    public void collectionIsEmptyToStart(){
        assertEquals(0, borrower.countBooks());
    }

    @Test
    public void canBorrowABook(){
        borrower.borrowBook(library);
        assertEquals(1, borrower.countBooks());
    }

}
