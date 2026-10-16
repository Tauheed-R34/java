
class Practical6 {
    int id;
    String name;

    // Default constructor
    Practical6() {
        id = 0;
        name = "Unknown";
    }

    // Parameterized constructor
    Practical6(int i, String n) {
        id = i;
        name = n;
    }

    // Overloaded constructor
    Practical6(int i) {
        id = i;
        name = "Student";
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Practical6 s1 = new Practical6();
        Practical6 s2 = new Practical6(101, "Ali");
        Practical6 s3 = new Practical6(102);

        s1.display();
        s2.display();
        s3.display();
    }
}
