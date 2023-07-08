package doublylinkedlist;

public class DoublyLinkedList {

    public DoublyLinkedList (int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    Node head;
    Node tail;
    int length;
    public class Node{
        Node(int value){
            this.value = value;
        }
        int value;
        Node next;
        Node prev;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getHead(){
        System.out.println("Head: " + head.value);
    }
    public void getTail(){
        System.out.println("Tail: " + tail.value);
    }
    public void getLength(){
        System.out.println("Length: " + length);
    }

}
