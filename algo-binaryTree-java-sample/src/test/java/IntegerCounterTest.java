import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerCounterTest {

    private IntegerCounter count;
    private BinaryTree inputTree;

    @Before
    public void setUp() throws Exception {
        count = new IntegerCounter();
    }

    @Test
    public void test_theCountOfGivenInteger_with_validInputs() {

        inputTree = new BinaryTree(1);

        int[] nums = {2, 2, 3, 4, 2, 3};
        for(int i : nums ) {
            inputTree.addNode( i );
        }

        assertEquals(3, count.getTheCountOfGivenInteger(inputTree,2));
        assertEquals(2, count.getTheCountOfGivenInteger(inputTree,3));
        assertEquals(1, count.getTheCountOfGivenInteger(inputTree,4));
    }
}