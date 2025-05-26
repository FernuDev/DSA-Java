package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.prepend(22);
        list.append(33);
        list.append(44);

        list.removeFirst();

        list.printList();
    }
}
