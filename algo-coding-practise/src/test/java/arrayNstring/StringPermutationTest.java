package arrayNstring;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringPermutationTest {

    private StringPermutation stringPermutation;

    @Before
    public void setUp() throws Exception {
        stringPermutation = new StringPermutation();
    }

    @Test
    public void checkIfStringPermutation() {

        String validSample1 = "ASGR";
        String validSample2 = "GRAS";

        String inValidSample1 = "sdyrtgbSSE";
        String inValidSample2 = "FSDFrtrvf3";

        assertEquals(true, stringPermutation.checkIfStringPermutation(validSample1, validSample2));
        assertEquals(false, stringPermutation.checkIfStringPermutation(inValidSample1, inValidSample2));
    }
}