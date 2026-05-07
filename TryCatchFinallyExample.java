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