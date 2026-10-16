
class Practical5 {
    int id;
    String name;

    Practical5() {
        id = 69;
        name = "Tauheed";
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Practical5 obj = new Practical5();
        obj.display();
    }
}
