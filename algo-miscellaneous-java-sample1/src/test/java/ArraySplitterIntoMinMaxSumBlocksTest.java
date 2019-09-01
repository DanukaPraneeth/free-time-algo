import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySplitterIntoMinMaxSumBlocksTest {

    private ArraySplitterIntoMinMaxSumBlocks arraySplitter;

    @Before
    public void setUp() throws Exception {
        arraySplitter = new ArraySplitterIntoMinMaxSumBlocks();
    }

    @Test
    public void test_MinimumMaximumSumCalculation_with_validInputs() {
        int [] sample1 = {2,1,5,1,2,2,2};
        int expectedResult1 = 6;

        assertEquals(expectedResult1, arraySplitter.getMinimumMaximumSum (3 , 5 , sample1));
    }
}