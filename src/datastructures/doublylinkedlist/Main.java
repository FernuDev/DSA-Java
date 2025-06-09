package datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(7);

        // Testing append method
        doublyLinkedList.append(4);
        doublyLinkedList.append(5);
        doublyLinkedList.append(6);

        System.out.println("Append Method: ");
        doublyLinkedList.printList();

        // Testing removeLast method
        doublyLinkedList.removeLast();
        doublyLinkedList.removeLast();
        doublyLinkedList.removeLast();
        doublyLinkedList.removeLast();

        System.out.println("Remove Last Method: ");
        doublyLinkedList.printList();

        // Testing the prepend method
        doublyLinkedList.append(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(4);

        // Apply to Prepend Method
        doublyLinkedList.prepend(5);

        System.out.println("Prepend Method: ");
        doublyLinkedList.printList();


    }
}
