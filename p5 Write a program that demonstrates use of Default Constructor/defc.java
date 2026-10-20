
class defc {
    int id;
    String name;

    defc() {
        id = 69;
        name = "Tauheed";
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        defc obj = new defc();
        obj.display();
    }
}
