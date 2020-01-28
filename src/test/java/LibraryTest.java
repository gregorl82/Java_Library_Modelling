import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(5);
        book = new Book("The Handmaid's Tale", "Margaret Attwood", "Sci-Fi");
    }

    @Test
    public void libraryIsEmptyToStart(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBookToStock(){
        library.addBook(book);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void checkLibraryHasSpace() {
        library.addBook(book);
        library.addBook(book);
        assertTrue(library.checkCapacity());
    }
}
