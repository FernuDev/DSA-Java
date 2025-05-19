package misc.big_o;

// Class for represent the big O notations
// Time complexity and some algorithms
public class BigO {

    // Exercise of Big O Notation O(n)
    public static void printItems(int n){
        for (int i=0;i<n;i++){ // Make n operations in the for loop so complexity is O(n)
            System.out.println(i);
        }
    }

    // Exercise of Big O Notation O(n^2)
    public static void printItems2(int n){

        // Two nested loops -> O(n*n) = O(n^2)
        for (int i=0;i<n;i++){ // Principal loop O(n)
            for (int j=0;j<n;j++){ // Nested loop O(n)
                System.out.println(i + " " + j);
            }
        }
    }

    // Exercise of Big O Notation O(1)
    public static void printNumber(int n){
        System.out.println(n); // Constant complexity
    }
}
