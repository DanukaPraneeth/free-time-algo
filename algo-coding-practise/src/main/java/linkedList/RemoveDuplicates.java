package linkedList;

import java.util.HashSet;

public class RemoveDuplicates {

    public LinkedListNode removeDuplicates(LinkedListNode n){

        HashSet<Integer> set = new HashSet<Integer>();
        LinkedListNode previous = null;

        while(n != null){
            if(set.contains(n.data)){
                previous.next = n.next;
            }
            else{
                set.add(n.data);
                previous = n;
                //previous.next = n.next;
            }
            n = n.next;
        }
        return n;
    }

}
