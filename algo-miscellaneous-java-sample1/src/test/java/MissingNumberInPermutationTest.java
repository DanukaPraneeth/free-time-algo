import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MissingNumberInPermutationTest {

    private MissingNumberInPermutation object;

    @Before
    public void setUp() throws Exception {
        object = new MissingNumberInPermutation();
    }

    @Test
    public void test_MissingPermutationElement_with_validInputs() {
        final int[] sample1 = {2,3,1,5};
        assertEquals(4, object.getMissingPermutationElement(sample1));
    }
}