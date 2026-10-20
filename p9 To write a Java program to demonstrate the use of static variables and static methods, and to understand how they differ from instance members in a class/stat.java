class stat {
    int rollNo;
    String name;

    static String college = "LTCE";
    static int count = 0;

    stat(int r, String n) {
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
        stat s1 = new stat(1, "Ali");
        stat s2 = new stat(2, "Tauheed");

        s1.display();
        s2.display();

        stat.displayCount();
    }
}
