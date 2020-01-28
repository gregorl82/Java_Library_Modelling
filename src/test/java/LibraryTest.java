import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private Book book6;

    @Before
    public void before(){
        library = new Library(5);
        book1 = new Book("The Handmaid's Tale", "Margaret Attwood", "Sci-Fi");
        book2 = new Book("2001: A Space Odyssey", "Arthur C. Clarke", "Sci-Fi");
        book3 = new Book("Wuthering Heights", "Emily Bronte", "Classics");
        book4 = new Book("Game of Thrones", "George R.R. Martin", "Fantasy");
        book5 = new Book("The Grapes of Wrath", "John Steinbeck", "Classics");
        book6 = new Book("A Walk in the Woods", "Bill Bryson", "Travel");
    }

    @Test
    public void libraryIsEmptyToStart(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBookToStock(){
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void checkLibraryHasSpace() {
        library.addBook(book1);
        library.addBook(book2);
        assertTrue(library.checkCapacity());
    }

    @Test
    public void cannotAddBookToStockIfNoCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        assertEquals(5, library.countBooks());
        assertFalse(library.checkCapacity());
    }

    @Test
    public void canRemoveABook(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        Book removedBook = library.removeBook();
        assertEquals(3, library.countBooks());
        assertNotNull(removedBook);
    }

    @Test
    public void canGetNumberOfBooksByGenre(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        assertEquals(2, library.numberOfBooksByGenre("Sci-Fi"));
    }
}
