public class IntegerCounter {

    public int getTheCountOfGivenInteger(BinaryTree root, int sampleInteger){

        if(root==null)
            return 0;

        int count=0;
        if (root.root == sampleInteger)
            count++;

        return count + getTheCountOfGivenInteger(root.left, sampleInteger) + getTheCountOfGivenInteger(root.right, sampleInteger);
    }

}
