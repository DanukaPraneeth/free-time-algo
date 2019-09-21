package arrayNstring;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceSpacesTest {

    private ReplaceSpaces replaceSpaces;

    @Before
    public void setUp() throws Exception {
        replaceSpaces = new ReplaceSpaces();
    }

    @Test
    public void replaceString() {
        String sample = "Mr John Smith    ";
        String result = "Mr%20John%20Smith";

        assertEquals(result, replaceSpaces.replaceString(sample, 13));
    }
}