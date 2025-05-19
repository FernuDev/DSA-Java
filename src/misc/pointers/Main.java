package misc.pointers;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // Without the using of pointers
        // the num2 only be equals to num1 at initialization
        int num1 = 11;
        int num2 = num1;

        num1 = 22;

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        // Using pointers
        // When we use classes we assign references
        // map1 points to a new HashMap in Heap Memory
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("value", 11);

        // When we made map2 equals to map1 we made
        // the two variables point to the same HashMap in the memory
        map2 = map1;

        map1.put("value", 22);

        System.out.println(map1);
        System.out.println(map2);
    }
}
