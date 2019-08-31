import java.util.HashSet;
import java.util.Set;

public class MaxDistictNumberCounter {

    // This method will find the count of maximum distinct numbers along a path from root

    public int findMaximumDistinctNumbers(BinaryTree T){
        //System.out.print(T.x);
        Set<Integer> unique = new HashSet<>();
        if(T == null)
            return 0;

        return getMaxCount(T , unique);
    }

    private static int getMaxCount(BinaryTree t, Set<Integer> unique){
        if(t == null){
            return unique.size();
        }

        int l = 0;
        int r = 0;
        if(unique.add(t.root)){
            l = getMaxCount(t.left, unique);
            r = getMaxCount(t.right, unique);
            unique.remove(t.root);
        }
        else{
            l = getMaxCount(t.left , unique);
            r = getMaxCount(t.right , unique);
        }
        return Math.max(l, r);
    }

}
