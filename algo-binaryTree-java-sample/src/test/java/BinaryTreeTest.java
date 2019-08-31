import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class BinaryTreeTest {

   private BinaryTree inputTree;
   private BinaryTree outputTree;
   private TreeComparator comparator;

   @Before
   public void setup(){
       comparator = new TreeComparator();
   }

    @Test
    public void test_BTreeCreation_with_addNode() {
        inputTree = new BinaryTree(1);
        inputTree.left = new BinaryTree(2);
        inputTree.right = new BinaryTree(3);
        inputTree.left.left= new BinaryTree(4);

        System.out.println("\ntraverse Pre order");
        inputTree.traversePreOrder();
        System.out.println("\ntraverse in order");
        inputTree.traverseInOrder();
        System.out.println("\ntraverse post order");
        inputTree.traversePostOrder();
        System.out.println("");

    }

    @Test
    public void test_BTreeCreation_with_Binary_property(){
        inputTree = new BinaryTree(3);
        int[] nums = { 2, 1 , 6 , 4 ,5};
        for(int i : nums ) {
            inputTree.addNode( i );
        }

        outputTree = new BinaryTree(3);
        outputTree.left = new BinaryTree(2);
        outputTree.left.left = new BinaryTree(1);
        outputTree.right= new BinaryTree(6);
        outputTree.right.left = new BinaryTree(4);
        outputTree.right.left.right = new BinaryTree(5);

        System.out.println("\ninput traverse Pre order");
        inputTree.traversePreOrder();

        System.out.println("\noutput traverse Pre order");
        outputTree.traversePreOrder();

        assertEquals(true, comparator.isTreeIdentical(inputTree, outputTree));
    }


    @Test
    public void test_BTree_getHeight(){
        inputTree = new BinaryTree(1);
        inputTree.left = new BinaryTree(2);
        inputTree.right = new BinaryTree(3);
        inputTree.left.left= new BinaryTree(4);

        assertEquals(2, inputTree.getTreeHeight(inputTree));
    }

}