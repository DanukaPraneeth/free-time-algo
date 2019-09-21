package arrayNstring;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharCountTest {

    private CharCount charCount;

    @Before
    public void setUp() throws Exception {
        charCount = new CharCount();
    }

    @Test
    public void checkforUnique() {

        String falseInput = "ajTFC6574UFTYFVa";
        String trueInput = "awetyu6328VNA";

        assertEquals(false, charCount.checkforUnique(falseInput));
        assertEquals(true, charCount.checkforUnique(trueInput));
    }
}