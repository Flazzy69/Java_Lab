import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a > b && a < c) || (a < b && a > c)) {
            System.out.println("Second largest: " + a);
        } else if ((b > a && b < c) || (b < a && b > c))
        {
            System.out.println("Second largest: " + b);
        } else {
            System.out.println("Second largest: " + c);
        }
    }
}