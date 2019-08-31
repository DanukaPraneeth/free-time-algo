import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    int root;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int num){
        root = num;
        left = null;
        right = null;
    }


    // As a convention, if the key to be inserted is less than the key of root node, then key is inserted in
    // left sub-tree; If key is greater, it is inserted in right sub-tree. If it is equal, as a convention, it
    // is inserted in right sub-tree
    public void addNode(int num){

        if(num < root){
            if(left != null)
                left.addNode(num);

            else
                left = new BinaryTree(num);

        }else{
            if(right != null)
                right.addNode(num);

            else
                right = new BinaryTree(num);
        }
    }

    // visit he root node first, then left sub tree, then right sub tree
    public void traversePreOrder(){
        System.out.print(root + ", ");

        if(left != null)
            left.traversePreOrder();

        if(right != null)
            right.traversePreOrder();

    }


    // visit left sub-tree, then node, then right sub-tree
    public void traverseInOrder(){
        if(left != null)
            left.traverseInOrder();

        System.out.print(root + ", ");

        if(right != null)
            right.traverseInOrder();
    }

    // visit left sub-tree, then right sub-tree, then node
    public void traversePostOrder(){
        if(left != null)
            left.traversePostOrder();

        if(right != null)
            right.traversePostOrder();

        System.out.print(root + ", ");
    }


    public int getTreeHeight(BinaryTree T){
        if(T == null)
            return -1;

        int height = 0;
        height = Math.max(height, 1+getTreeHeight(T.left));
        height = Math.max(height, 1+getTreeHeight(T.right));
        return height;
    }

}
