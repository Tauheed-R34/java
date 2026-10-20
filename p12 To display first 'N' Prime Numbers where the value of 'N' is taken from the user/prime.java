
import java.util.Scanner;

class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int count = 0;
        int num = 2;

        System.out.println("First " + n + " prime numbers:");

        while (count < n) {
            boolean prime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }

        sc.close();
    }
}
