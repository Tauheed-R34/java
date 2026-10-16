
class Practical9 {
    int rollNo;
    String name;

    static String college = "LTCE";
    static int count = 0;

    Practical9(int r, String n) {
        rollNo = r;
        name = n;
        count++;
    }

    static void displayCount() {
        System.out.println("Total students: " + count);
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Practical9 s1 = new Practical9(1, "Ali");
        Practical9 s2 = new Practical9(2, "Tauheed");

        s1.display();
        s2.display();

        Practical9.displayCount();
    }
}
