import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySplitterWithMaxMaxvalueDiffTest {

    private ArraySplitterWithMaxMaxvalueDiff arraySplitter;

    @Before
    public void setUp() throws Exception {
        arraySplitter = new ArraySplitterWithMaxMaxvalueDiff();
    }

    @Test
    public void test_MaxMaxValueDiffCalculation_with_validInputs() {
        int[] sample1 = {1,3,-3};
        int[] sample2 = {4,3,2,5,1,1};
        assertEquals(6, arraySplitter.getMaxMaxValueDiff(sample1));
        assertEquals(4, arraySplitter.getMaxMaxValueDiff(sample2));
    }
}