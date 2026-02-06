import java.util.*;

public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any two numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();

            int div = a / b;
            System.out.println("Division: " + div);
        }
        catch (ArithmeticException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        finally {
            System.out.println("Program End");
        }
    }
}
