class copcon {
    int id;
    String name;

    copcon(int i, String n) {
        id = i;
        name = n;
    }

    copcon(copcon s) {
        id = s.id;
        name = s.name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        copcon s1 = new copcon(101, "Tauheed");

        copcon s2 = new copcon(s1);

        System.out.println("Original object:");
        s1.display();

        System.out.println("Copied object:");
        s2.display();
    }
}
