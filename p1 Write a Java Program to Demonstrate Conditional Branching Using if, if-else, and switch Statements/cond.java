import java.util.Scanner;

public class cond {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        
        if (number == 0) {
            System.out.println("[if] The number is exactly zero.");
        }

        
        if (number > 0) {
            System.out.println("[if-else] The number is positive.");
        } else {
            System.out.println("[if-else] The number is negative or zero.");
        }

        
        switch (number) {
            case 1:
                System.out.println("[switch] You entered ONE.");
                break;

            case 2:
                System.out.println("[switch] You entered TWO.");
                break;

            case 3:
                System.out.println("[switch] You entered THREE.");
                break;

            default:
                System.out.println("[switch] Number is not 1, 2, or 3.");
        }

        sc.close();
    }
}