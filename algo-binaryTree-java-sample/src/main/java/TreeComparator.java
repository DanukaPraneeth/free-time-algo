public class TreeComparator {

    // This method will return true if the two trees are identical

    public boolean isTreeIdentical(BinaryTree t1 , BinaryTree t2){

        if (t1 == null  && t2 == null)
            return true;

        return ( (t1.root == t2.root) && isTreeIdentical(t1.left , t2.left) && isTreeIdentical(t1.right, t2.right) );

    }

}
