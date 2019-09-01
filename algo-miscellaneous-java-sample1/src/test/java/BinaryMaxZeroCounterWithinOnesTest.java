import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryMaxZeroCounterWithinOnesTest {

    private BinaryMaxZeroCounterWithinOnes binaryZeroCounter;

    @Before
    public void setUp() throws Exception {
        binaryZeroCounter = new BinaryMaxZeroCounterWithinOnes();
    }

    @Test
    public void test_MaxMiddleZeroCountInBinary_with_validInput() {
        int sample1 = 2120;          // 100001001000
        int expected1 = 4;
        int sample2 = 2192;        //  100010010000
        int expected2 = 3;
        int sample3 = 4241;          // 1000100100001
        int expected3 = 4;
        int sample4 = 154;           // 10011010
        int expected4 = 2;
        int sample5 = 32;           // 100000
        int expected5 = 0;
        int sample6 = 1162;         // 10010001010
        int expected6 = 3;

        assertEquals(expected1, binaryZeroCounter.countMaxMiddleZero(sample1));
        assertEquals(expected2, binaryZeroCounter.countMaxMiddleZero(sample2));
        assertEquals(expected3, binaryZeroCounter.countMaxMiddleZero(sample3));
        assertEquals(expected4, binaryZeroCounter.countMaxMiddleZero(sample4));
        assertEquals(expected5, binaryZeroCounter.countMaxMiddleZero(sample5));
        assertEquals(expected6, binaryZeroCounter.countMaxMiddleZero(sample6));

    }
}