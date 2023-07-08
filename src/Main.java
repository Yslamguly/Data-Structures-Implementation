import doublylinkedlist.DoublyLinkedList;
import linkedlist.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(5);
        doublyLinkedList.getHead();

        doublyLinkedList.append(6);

        doublyLinkedList.getTail();
        doublyLinkedList.getLength();
        doublyLinkedList.printList();

    }
}