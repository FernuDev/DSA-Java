package datastructures.doublylinkedlist;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            append(value);
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;

        Node temp = head;

        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }

        length--;

        return temp;
    }

    public Node removeLast() {
        if (length == 0) return null;

        Node temp = tail;

        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }

        length--;
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        DoublyLinkedList.Node current = head;

        System.out.print("List: < ");
        while (current != null){
            if (current.next != null) {
                System.out.print(current.value + ", ");
            } else {
                System.out.print(current.value + " ");
            }
            current = current.next;
        }
        System.out.println(">");
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

}
