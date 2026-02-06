import java.util.Scanner;
class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter operator (+ - * / %): ");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                System.out.println("Result: " + (a / b));
                break;
            case '%':
                System.out.println("Result: " + (a % b));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}