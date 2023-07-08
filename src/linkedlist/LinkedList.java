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
    public class Node {
        Node(int value){
            this.value = value;
        }
        public int value;
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
    public Node removeLastItem(){
        if(length == 0){
            return null;
        }
        Node temp = head;
        Node pre = head;
        while (temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }
    public void prepend (int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }
    public Node removeFirstItem(){
        if(length == 0){
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length == 1){
            tail = null;
        }
        return temp;
    }
    public Node get(int index){
        if(index >= length || index < 0){
            return null;
        }
        Node temp = head;
        int i = 0;
        while (i != index){
            temp = temp.next;
            i++;
        }
        return temp;
    }
    public boolean set(int index, int value){
        if(index >= length || index < 0){
            return false;
        }
        Node temp = get(index);
        if(temp!=null){
            temp.value = value;
            return true;
        }
        return false;
    }
    public boolean insert (int index, int value){
        return true;
    }
}
