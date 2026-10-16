
interface Printable {
    void print();
}

class Student implements Printable {
    public void print() {
        System.out.println("Student details");
    }
}

class Practical18 {
    public static void main(String[] args) {
        Student s = new Student();
        s.print();
    }
}
