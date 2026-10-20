
import java.util.Vector;

class vec {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        
        v.add("Apple");
        v.add("Mango");
        v.add("Banana");
       
        System.out.println("Vector: " + v);
       
        System.out.println("First element: " + v.get(0));
     
        v.remove("Mango");

        System.out.println("After removal: " + v);
    }
}
