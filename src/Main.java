import doublylinkedlist.DoublyLinkedList;
import linkedlist.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(5);

        doublyLinkedList.append(6);

        doublyLinkedList.removeLast();


        doublyLinkedList.getHead();
        doublyLinkedList.getTail();
        doublyLinkedList.prepend(3);
        doublyLinkedList.set(0,78);
        doublyLinkedList.insert(1,55);
        doublyLinkedList.getLength();

        doublyLinkedList.printList();

    }
}