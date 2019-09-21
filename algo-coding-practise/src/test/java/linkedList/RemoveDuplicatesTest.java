package linkedList;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class RemoveDuplicatesTest {

    private LinkedListNode inputNode;
    private LinkedListNode outputNode;
    private LinkedListNode methodOutputNode;

    private RemoveDuplicates removeDuplicates;
    private LinkedList<Integer> linkedList;

    @Before
    public void setUp() throws Exception {
        inputNode = new LinkedListNode();
        outputNode = new LinkedListNode();
        methodOutputNode = new LinkedListNode();
        removeDuplicates = new RemoveDuplicates();
    }

    @Test
    public void test_removeDuplicates() {

        inputNode.data = 1;
        inputNode.next = null;
        inputNode.appendToTail(inputNode, 2);
        inputNode.appendToTail(inputNode, 3);
        inputNode.appendToTail(inputNode, 2);
        inputNode.appendToTail(inputNode, 4);
        inputNode.appendToTail(inputNode, 1);
        inputNode.appendToTail(inputNode, 5);
        inputNode.display(inputNode);

        outputNode.data = 1;
        outputNode.next = null;
        outputNode.appendToTail(outputNode, 2);
        outputNode.appendToTail(outputNode, 3);
        outputNode.appendToTail(outputNode, 4);
        outputNode.appendToTail(outputNode, 5);
        outputNode.display(outputNode);

        inputNode.removeDuplicate(inputNode);
        inputNode.display(inputNode);

    }
}