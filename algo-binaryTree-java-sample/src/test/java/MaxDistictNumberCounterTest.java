import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxDistictNumberCounterTest {

    private BinaryTree tree, tree2;
    private MaxDistictNumberCounter q;

    @Before
    public void setup(){
        q = new MaxDistictNumberCounter();
    }

    @Test
    public void test_findMaximumDistinctNumbers_validResponse_solution() {
        tree = new BinaryTree(4);
        tree.left = new BinaryTree(5);
        tree.right = new BinaryTree(6);
        tree.left.left= new BinaryTree(4);
        tree.left.left.left= new BinaryTree(5);
        tree.right.left = new BinaryTree(1);
        tree.right.right = new BinaryTree(6);

        tree.traversePreOrder();

        assertEquals(3,q.findMaximumDistinctNumbers(tree));

        tree2 = new BinaryTree(4);
        tree2.left = new BinaryTree(5);
        tree2.right = new BinaryTree(6);
        tree2.left.left= new BinaryTree(4);
        tree2.left.left.left= new BinaryTree(5);
        tree2.right.left = new BinaryTree(1);
        tree2.right.right = new BinaryTree(7);
        tree2.right.left.left = new BinaryTree(2);
        tree2.right.left.right = new BinaryTree(3);
        tree2.right.right.left = new BinaryTree(6);
        tree2.right.right.right = new BinaryTree(4);

        assertEquals(4,q.findMaximumDistinctNumbers(tree2));

    }
}