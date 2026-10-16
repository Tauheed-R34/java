
class Practical7 {
    int id;
    String name;

    Practical7(int i, String n) {
        id = i;
        name = n;
    }

    // Copy constructor
    Practical7(Practical7 s) {
        id = s.id;
        name = s.name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Practical7 s1 = new Practical7(101, "Ali");

        Practical7 s2 = new Practical7(s1);

        System.out.println("Original object:");
        s1.display();

        System.out.println("Copied object:");
        s2.display();
    }
}
