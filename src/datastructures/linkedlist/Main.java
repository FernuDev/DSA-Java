package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.prepend(22);
        list.append(33);
        list.append(44);

        list.printList();
        System.out.println("Node at [1]: " + list.get(1).value);

        // Probando la implementación del metodo set
        list.insert(3, 55);
        list.printList();
    }
}
