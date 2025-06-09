public class SinglyLinkedList<T>{

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

    // Main method for testing
    public static void main(String[] args){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addToFront(10);
        list.addToFront(20);
        list.addToFront(30);
        list.addToBack(40);
        list.addToBack(50);
        list.removeFromFront();
        list.removeFromBack();

        System.out.println(list.printList());
    }

/*
 * Remove operations can be optimized by adding a tail pointer
 */

}