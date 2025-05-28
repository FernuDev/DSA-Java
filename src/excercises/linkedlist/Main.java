package excercises.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(1);

        list.append(2);
        list.append(5);
        list.append(4);
        list.append(5);

        System.out.println("Middle Node: " + list.findMiddleNode().value);
    }
}
