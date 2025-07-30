package datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(7);

        // Testing append method
        doublyLinkedList.append(4);
        doublyLinkedList.append(5);
        doublyLinkedList.append(6);

        System.out.println("\nAppend Method: ");
        doublyLinkedList.printList();

        // Testing removeLast method
        doublyLinkedList.removeLast();
        doublyLinkedList.removeLast();
        doublyLinkedList.removeLast();
        doublyLinkedList.removeLast();

        System.out.println("\nRemove Last Method: ");
        doublyLinkedList.printList();

        // Testing the prepend method
        doublyLinkedList.append(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(4);

        // Apply to Prepend Method
        doublyLinkedList.prepend(5);

        System.out.println("\nPrepend Method: ");

        doublyLinkedList.printList();

        // Testing removeFirst Method
        doublyLinkedList.removeFirst();
        System.out.println("\nRemove First Method: ");
        doublyLinkedList.printList();

        // Get method
        System.out.println("\nGetting the 3th (2th index) element of the linked list: " + doublyLinkedList.get(2).value);

        // Set method
        doublyLinkedList.set(3, 10);
        System.out.println("\nSetting the 4th element of the linked list: ");
        doublyLinkedList.printList();

        // Insert method
        doublyLinkedList.insert(1, 5);
        System.out.println("\nInserting 5 at 1 index: ");
        doublyLinkedList.printList();

    }
}
