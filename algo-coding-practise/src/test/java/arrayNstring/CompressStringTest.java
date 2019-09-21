package arrayNstring;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompressStringTest {

    private CompressString compressString;

    @Before
    public void setUp() throws Exception {
        compressString = new CompressString();
    }

    @Test
    public void compressString() {
        String input1 = "aabcccccaaa";
        String output1 = "a2b1c5a3";

        String input2 = "abcdef";
        String output2 = "abcdef";

        String input3 = "sfsdfdsffgggreret";
        String output3 = "sfsdfdsffgggreret";

        assertEquals(output1, compressString.compressString(input1));
        assertEquals(output2, compressString.compressString(input2));
        assertEquals(output3, compressString.compressString(input3));
    }
}