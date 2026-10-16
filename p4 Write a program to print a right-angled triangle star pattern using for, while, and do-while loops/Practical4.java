
class Practical4 {
    public static void main(String[] args) {
        int i, j;

        System.out.println("Using for loop:");

        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Using while loop:");

        i = 1;
        while (i <= 5) {
            j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println("Using do-while loop:");

        i = 1;
        do {
            j = 1;
            do {
                System.out.print("* ");
                j++;
            } while (j <= i);

            System.out.println();
            i++;
        } while (i <= 5);
    }
}
