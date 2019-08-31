import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeComparatorTest {

    private TreeComparator compare;
    private BinaryTree tree1;
    private BinaryTree tree2;

    @Before
    public void setUp() throws Exception {
        compare = new TreeComparator();
    }

    @Test
    public void test_for_IdenticalTrees_with_validInputs() {

        tree1 = new BinaryTree(1);
        tree2 = new BinaryTree(1);

        int[] nums = {2, 3, 4};

        for(int i : nums ) {
            tree1.addNode( i );
            tree2.addNode(i);
        }

        assertEquals(true, compare.isTreeIdentical(tree1, tree2));
    }


}