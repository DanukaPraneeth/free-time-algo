import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNumberInPermutation {

    // THis method will return the missing element in a number permutation given in as an array

    public int getMissingPermutationElement(int[] A){

        int size = A.length;
        int smallest = 1;

        if (A.length == 0 || A == null)
            return smallest;

        List<Integer> l = new ArrayList<>();
        for (int a : A)
            l.add(a);

        Collections.sort(l);

        if(l.get(0) > smallest)
            return smallest;

        for(int i = 0; i < size - 1; i++){
            if(l.get(i+1) - l.get(i) >= 2){
                smallest = l.get(i) + 1;
                break;
            }
        }

        // If all the elements are present in the array, then return largest element + 1
        if(smallest == 1)
            smallest = l.get(size-1) +1;

        if(smallest < 1)
            smallest = 1;

        return smallest;


    }
}
