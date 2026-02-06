import java.util.Scanner;

public class NestedExceptionExample {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter two numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();

            try {
                int div = a / b;  // may cause ArithmeticException
                System.out.println("Division: " + div);
            }
            catch (ArithmeticException ex) {
                System.out.println("Inner Exception: " + ex.getMessage());
            }
        }
        catch (Exception ex) {
            System.out.println("Outer Exception: " + ex.getMessage());
        }
        finally {
            System.out.println("Program End");
        }
    }
}
