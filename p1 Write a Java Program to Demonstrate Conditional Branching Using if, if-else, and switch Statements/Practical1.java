
import java.util.Scanner;

class Practical1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // if statement
        if (n > 0) {
            System.out.println("Number is positive");
        }

        // if-else statement
        if (n % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        // switch statement
        System.out.print("Enter a number from 1 to 3: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
