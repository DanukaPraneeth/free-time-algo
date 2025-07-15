import java.util.NoSuchElementException;

import org.w3c.dom.Node;
import java.util.Iterator;
import java.util.NoSuchElementException; // also useful if you use next() safely

public class SinglyLinkedList<T> implements Iterable<T>{

    // Head of the List
    private Node<T> head;

    // Static Inner Node Class
    private static class Node<T>{
        private T data;
        private Node<T> next;

        private Node(T data, Node<T> next){
            this.data = data;
            this.next = next;
        }

        private Node(T data){ this(data, null); }
    }

    // Add new node to the front of the list
    public void addToFront(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    // Add new Node to the back of the list
    public void addToBack(T data){
        if(head == null){
            head = new Node<>(data);
        }
        else{
            Node<T> current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = new Node<>(data);
        }
    }

    // Remove from Front
    public void removeFromFront(){
        head = head.next;
    }

    // Remove from back
    public void removeFromBack(){
        if(head == null){ return; }
        else if (head.next == null){ head = null; }
        else{
            Node<T> current = head;
            while(current.next.next != null){
                current = current.next;
            }
            current.next = null;
        }
    }

    // Remove duplicates
    public void removeDuplicates(){
        Node<T> current = head;
        while (current != null && current.next != null) {
            if (current.data.equals(current.next.data)) {
                current.next = current.next.next;  // Skip the duplicate
            } else {
                current = current.next;            // Move forward
            }
        }           
    }

    // Remove duplicates recursively
    public void removeDuplicatesRecur(){
        head = rRemove(head);
    }

    private Node<T> rRemove(Node<T> curr){
        if(curr == null){
            return null;
        }
        curr.next = rRemove(curr.next);
        if(curr.next != null && curr.data.equals(curr.next.data)){
            return curr.next;
        }
        return curr;

    }
    
    // Print the LinkedList
    public String printList(){
        String answer = "";
        Node<T> current = head;
        while(current != null){
            answer += current.data + " ";
            current = current.next;
        }
        return answer.trim();
    }


    // making the custom SinglyLinkedList class iterable
    // Method 1:
    /*
    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            private Node<T> current = head;
    
            @Override
            public boolean hasNext() {
                return current != null;
            }
    
            @Override
            public T next() {
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }
    */
    // Method2: 
    public Iterator<T> iterator() {
        return new LLIterator();
    }

    private class LLIterator implements Iterator<T> {
        private Node<T> curr;
        LLIterator() { curr = head;}
        public boolean hasNext() { return curr != null; }

        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            T temp = curr.data;
            curr = curr.next;
            return temp;
        }
    }


    // Main method for testing
    public static void main(String[] args){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        System.out.println(list.printList());
        list.addToFront(30);
        list.addToFront(10);
        list.addToFront(10);
        System.out.println(list.printList());
        list.addToBack(30);
        list.addToBack(40);
        System.out.println("before removing duplicates: " + list.printList());

        list.removeDuplicatesRecur();
        System.out.println("after removing duplicates: " + list.printList());       
        list.removeFromFront();
        list.removeFromBack();
        System.out.println(list.printList());

        for (int number : list){
            // Modifications doesn't work here, as it only read the value
            System.out.println(number);   
        }

        // If you need Modifications like .remove(), do it like this

        Iterator<Integer> iterateIt = list.iterator();
        while(iterateIt.hasNext()){
            System.out.println(iterateIt.next());
        }


    }

/*
 * Remove operations can be optimized by adding a tail pointer
 */

}