
import java.util.Vector;

class Practical3 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();

        // Adding elements
        v.add("Apple");
        v.add("Mango");
        v.add("Banana");

        // Displaying elements
        System.out.println("Vector: " + v);

        // Accessing an element
        System.out.println("First element: " + v.get(0));

        // Removing an element
        v.remove("Mango");

        System.out.println("After removal: " + v);
    }
}
