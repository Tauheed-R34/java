class parac {
    int id;
    String name;

    parac() {
        id = 0;
        name = "Unknown";
    }

    parac(int i, String n) {
        id = i;
        name = n;
    }

    parac(int i) {
        id = i;
        name = "Student";
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        parac s1 = new parac();
        parac s2 = new parac(101, "Tauheed");
        parac s3 = new parac(102);

        s1.display();
        s2.display();
        s3.display();
    }
}