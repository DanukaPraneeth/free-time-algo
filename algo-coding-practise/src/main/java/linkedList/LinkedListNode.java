package linkedList;

import java.util.HashSet;

public class LinkedListNode {

    int data;
    LinkedListNode next;

    public LinkedListNode appendToTail(LinkedListNode root, int item){
        LinkedListNode temp = new LinkedListNode();
        temp.data = item;
        temp.next = null;
        LinkedListNode ptr;

        if(root == null)
            root = temp;
        else{
            ptr = root;
            while(ptr.next !=null)
                ptr = ptr.next;
            ptr.next = temp;
        }
        return root;
    }

    public void display(LinkedListNode root){
        while(root != null){
            System.out.print(root.data + " ");
            root = root.next;
        }
        System.out.println(" ");
    }

    public void removeDuplicate(LinkedListNode n)
    {
        HashSet<Integer> set = new HashSet<Integer>();
        LinkedListNode previous = null;

        while(n != null){
            if(set.contains(n.data)){
                previous.next = n.next;
            }
            else{
                set.add(n.data);
                previous = n;
            }
            n = n.next;
        }

    }

}
