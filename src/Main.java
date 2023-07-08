import linkedlist.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(4);
        linkedList.append(5);
        linkedList.append(5);
        System.out.println("Head: " + linkedList.getHead());
        System.out.println("Tail: "+linkedList.getTail());
        System.out.println("Length: " + linkedList.getLength());

        linkedList.prepend(9);

        linkedList.set(1,6);
        linkedList.insert(0,10);
        linkedList.remove(2);
        System.out.println("Linked list: ");
        linkedList.printList();



    }
}