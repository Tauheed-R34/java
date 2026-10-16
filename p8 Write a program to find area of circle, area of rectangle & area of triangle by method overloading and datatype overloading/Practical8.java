
class Practical8 {

    // Circle with integer radius
    int area(int r) {
        return (int) (3.14 * r * r);
    }

    // Circle with double radius
    double area(double r) {
        return 3.14 * r * r;
    }

    // Rectangle
    int area(int l, int b) {
        return l * b;
    }

    // Triangle
    double area(double b, double h) {
        return 0.5 * b * h;
    }

    public static void main(String[] args) {
        Practical8 obj = new Practical8();

        System.out.println("Area of circle (int): "
                           + obj.area(5));

        System.out.println("Area of circle (double): "
                           + obj.area(5.5));

        System.out.println("Area of rectangle: "
                           + obj.area(5, 4));

        System.out.println("Area of triangle: "
                           + obj.area(5.0, 4.0));
    }
}
