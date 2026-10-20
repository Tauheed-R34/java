import java.util.Scanner;

class exc {

    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above");
        }

        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            checkAge(age);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
            sc.close();
        }
    }
}