public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            int result = a / b; // ❌ error (divide by zero)
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero");

        } finally {
            System.out.println("Finally block always executes");
        }
    }
}
//mastering the throws key word
public class ThrowExample {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        checkAge(16);
    }
}