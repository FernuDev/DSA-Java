package datastructures.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void append(int value){
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void prepend(int value){
        Node newNode = new Node(value);

        if (size == 0){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public Node removeLast(){
        if (size == 0) return null;
        Node temp = head;
        Node prev = head;

        while (temp.next != null){
            prev = temp;
            temp = temp.next;
        }
        // Eliminamos la referencia al siguiente nodo
        tail = prev;
        prev.next = null;
        size--;

        if (size == 0) {
            head = tail = null;
        }

        return temp;
    }

    public Node removeFirst() {
        if (size == 0) return null;
        Node temp = head;
        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
            temp.next = null;
        }
        size--;
        return temp;
    }

    public void printList(){
        Node current = head;

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

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getSize() {
        System.out.println("Size: " + size);
    }
}
