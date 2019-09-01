import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySplitterWithMinSumDiffTest {

    private ArraySplitterWithMinSumDiff arraySplitter;

    @Before
    public void setUp() throws Exception {
        arraySplitter = new ArraySplitterWithMinSumDiff();
    }

    @Test
    public void test_ArraySplitter_MinAbsoluteDiff_with_validInputs() {

        final int[] sample1 = {3,1,2,4,3};
        assertEquals(1,arraySplitter.getMinAbsoluteDiff(sample1));

    }
}