package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(11);

        list.append(22);
        list.append(33);
        list.append(44);

        list.printList();

        list.removeLast();

        list.printList();
    }
}
