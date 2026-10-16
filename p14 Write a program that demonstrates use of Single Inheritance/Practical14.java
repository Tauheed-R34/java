
class Parent {
    void displayParent() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    void displayChild() {
        System.out.println("This is child class");
    }
}

class Practical14 {
    public static void main(String[] args) {
        Child obj = new Child();

        obj.displayParent();
        obj.displayChild();
    }
}
