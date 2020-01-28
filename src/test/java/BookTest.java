import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classics");
    }

    @Test
    public void hasATitle(){
        assertEquals("The Great Gatsby", book.getTitle());
    }

    @Test
    public void hasAnAuthor(){
        assertEquals("F. Scott Fitzgerald", book.getAuthor());
    }

    @Test
    public void hasAGenre(){
        assertEquals("Classics", book.getGenre());
    }

}
