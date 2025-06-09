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

        if (size == 0){
            head = newNode;
        } else {
            tail.next = newNode;
        }
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
        if (size == 0) {
            return null;
        }
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

    public Node get(int index){
        if (index < 0 || index >= size){
            return null;
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if (temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){

        if (index < 0 || index > size){
            return false;
        }

        if (index == 0){
            prepend(value);
            return true;
        }

        if (index == size){
            append(value);
            return true;
        }

        Node temp = get(index - 1);
        Node newNode = new Node(value);

        newNode.next = temp.next;
        temp.next = newNode;
        size++;

        return true;
    }

    public Node remove(int index){
        if (index < 0 || index > size){
            return null;
        }

        if (index == 0){
            return removeFirst();
        }

        if (index == size){
            return removeLast();
        }

        Node prev = get(index - 1);
        Node temp = prev.next;

        prev.next = temp.next;
        size--;
        return temp;
    }

    public void reverse(){
        Node current = head;
        head = tail;
        tail = current;

        Node after = current.next;
        Node before = null;

        for (int i = 0; i < size; i++){
            after = current.next;
            current.next = before;
            before = current;
            current = after;
        }
    }

    public boolean isEmpty(){
        return size == 0;
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
