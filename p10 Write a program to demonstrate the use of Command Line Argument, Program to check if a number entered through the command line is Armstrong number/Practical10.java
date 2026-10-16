
class Practical10 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter number as command line argument");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int temp = n;
        int digits = 0;
        int sum = 0;

        int x = n;

        do {
            digits++;
            x = x / 10;
        } while (x != 0);

        x = n;

        while (x != 0) {
            int digit = x % 10;
            int power = 1;

            for (int i = 1; i <= digits; i++) {
                power = power * digit;
            }

            sum = sum + power;
            x = x / 10;
        }

        if (n >= 0 && sum == temp) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }
    }
}
