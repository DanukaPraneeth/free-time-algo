import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryDigitCounterTest {

    private BinaryDigitCounter digitCounter;

    @Before
    public void setUp() throws Exception {
        digitCounter = new BinaryDigitCounter();
    }

    @Test
    public void test_BinaryOnesCounter_with_validInputs() {
        assertEquals(3, digitCounter.getOnesCount(3, 7));
        assertEquals(20, digitCounter.getOnesCount(100000000, 100000000));
    }

    @Test
    public void test_BinaryZerosCount_with_validInputs() {
        assertEquals(2, digitCounter.getZerosCount(21));
        assertEquals(15, digitCounter.getZerosCount(100000000));
    }
}