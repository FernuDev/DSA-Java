package excercises.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {

    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Node findMiddleNode(){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public void removeDuplicates() {
        Set<Integer> seen = new HashSet<>();
        Node current = head;
        Node prev = null;

        int size = getSize();

        while (current != null) {
            if (seen.contains(current.value)) {
                // Eliminar duplicado
                prev.next = current.next;
                size--; // ⚠️ Importante: reducir tamaño
            } else {
                seen.add(current.value);
                prev = current;
            }
            current = current.next;
        }
    }

    public Node findKthFromEnd(int k) {
        if (k <= 0) return null;

        int size = getSize();
        if (k > size) return null;

        int positionFromStart = size - k;
        Node current = head;
        for (int i = 0; i < positionFromStart; i++) {
            current = current.next;
        }
        return current;
    }

    public int binaryToDecimal(){

        int size = getSize() - 1;
        int number = 0;
        Node current = head;

        while(size >= 0) {
            number += (int) (Math.pow(2, size) * current.value);
            current = current.next;
            size--;
        }

        return number;
    }

    public Node partition(Node head, int k) {
        if (head == null) return null;
        if (head.next == null) return head;

        Node dummy1 = new Node(0);
        Node temp1 = dummy1;

        Node dummy2 = new Node(0);
        Node temp2 = dummy2;

        Node current = head;

        while (current != null) {
            if (current.value < k) {
                temp1.next = current.next;
                temp1 = temp1.next;
            } else {
                temp2.next = current.next;
                temp2 = temp2.next;
            }
            current = current.next;
        }

        temp2.next = null;
        temp1.next = dummy2.next;

        return dummy1.next;
    }

    private int getSize() {
        int size = 0;
        Node current = head;

        while(current != null) {
            size++;
            current = current.next;
        }

        return size;
    }

}

