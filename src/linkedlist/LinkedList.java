package linkedlist;

public class LinkedList {
    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    private Node head;
    private Node tail;
    private int length;
    class Node {
        Node(int value){
            this.value = value;
        }
        int value;
        Node next;
    }
    public void printList(){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public Integer getHead(){
        if(head != null){
            return head.value;
        }
        else{
            return null;
        }
    }
    public Integer getTail(){
        if(tail != null){
            return tail.value;
        }
        else{
            return null;
        }
    }
    public int getLength(){
        return length;
    }
    public void append (int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    public void prepend (int value){}
    public boolean insert (int index, int value){return true;}
}
