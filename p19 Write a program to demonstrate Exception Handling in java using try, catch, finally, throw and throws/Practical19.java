
class Practical19 {

    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above");
        }

        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        try {
            int age = 16;

            checkAge(age);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
