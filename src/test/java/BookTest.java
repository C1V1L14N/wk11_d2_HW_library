import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("What A Funny Guy!",
                "Kenny McKeown", "Horror" );
    }

    @Test
    public void bookHasTitle(){
        assertEquals("What A Funny Guy!", book.getBookTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Kenny McKeown", book.getBookAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Horror", book.getBookGenre());
    }

}
